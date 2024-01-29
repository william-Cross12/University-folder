// defines the start 
const scenariosInformation = {};

// finds the closest ancestor of the given element
// (returns the id of the scenario div (e.g: trolleyProblem_4))
function getScenarioId(element) {
    return element.closest(".scenario").id;
}

// when the pull lever button is pressed this function is ran
function pullLever(element) {
    const scenarioId = getScenarioId(element);
    const trolley = document.getElementById(scenarioId).querySelector(".trolley");

    // Toggle the vertical position of the "trolley" element between "30px" and "130px" based on its current position.
    // If the current bottom position is "30px", set it to "130px". otherwise, set it to "30px".
    trolley.style.bottom = trolley.style.bottom === "30px" ? "130px" : "30px";

    if (!scenariosInformation[scenarioId]) {
        // if the scenariosInformation id doesn't exist, it is created
        scenariosInformation[scenarioId] = {
            leverPullCount: 1,
            peopleHit: 0,
        }
    } else {
        // if the scenariosInformation id does exist, 1 is added to the lever pulls
        scenariosInformation[scenarioId].leverPullCount++;
    }
}


function startTrolley(element) {
    // Get the scenario ID and its trolley based on the variable from the HTML
    const scenarioId = getScenarioId(element);
    const trolley = document.getElementById(scenarioId).querySelector(".trolley");

    // incrementally move the trolley from position 10 to position 300 using the moveTrolley function
    for (let pos = 10; pos <= 300; pos++) {
        moveTrolley(pos,  trolley, scenarioId);
    }
    // initilise the scenario info if it doesn't exist
    if (!scenariosInformation[scenarioId]) {
        scenariosInformation[scenarioId] = {
            leverPullCount: 0,
            peopleHit: 0,
            position: "Bottom",
        }
    }
    // update the simulation info for the specified scenario
    addSimulationInfo(scenarioId);
}

function moveTrolley(pos, trolley, scenarioId) {
    setTimeout(() => {
        // Set a timeout to incrementally update the left position of the trolley
        // this smoothly moves the trolley along whichever track its currently on
        trolley.style.left = pos + "px";

        // hit person is triggered when the trolley reaches the first persons position (140)
        if (pos === 140) {
            hitPerson(trolley, scenarioId);
        }
    }, pos * 10); // The delay is based on the current position
}

function hitPerson(trolley, scenarioId) {
    // Obtain the current bottom position of the trolley (which track its on)
    const trolleyPosition = parseInt(trolley.style.bottom);
    
    // selects all the people in the current scenario (named rows)
    const rows = document.querySelectorAll("#" + scenarioId + " .row1, #" + scenarioId + " .row2");

    rows.forEach((row) => {
        const isRow1 = row.classList.contains("row1");
        const isRow2 = row.classList.contains("row2");

        // depending on which track the trolley is depends on which row of people are hit
        if ((trolleyPosition === 30 && isRow1) || (trolleyPosition === 130 && isRow2)) {
            row.style.backgroundColor = "red";
        } else {
            row.style.backgroundColor = "";
        }
    });
}

// resets all values in the scenariosInformation for teh specified scenario
function resetSimulation(element) {
    const scenarioId = getScenarioId(element);

    // Reset trolley
    const trolley = document.getElementById(scenarioId).querySelector(".trolley");
    trolley.style.left = "10px"; // Set the initial left position
    trolley.style.bottom = "30px";
    trolley.style.backgroundColor = "purple"; // Set the initial background color

    // Reset rows
    const rows = document.querySelectorAll("#" + scenarioId + " .row1, #" + scenarioId + " .row2");
    rows.forEach((row) => {
    row.style.backgroundColor = "blue"; // Set the initial background color
    });

    // Reset number of lever pulls
    if (scenariosInformation[scenarioId]) {
        delete scenariosInformation[scenarioId];
    }
}

// determines if the trolley is on the top or bottom track by checking the number on leverPullCount
// if its even its on the bottom track, if odd then its the top track
function whichTrack(number) {
    if (number % 2 === 0) {
      return "Bottom";
    } else {
      return "Top";
    }
  }

// Updates simulation information for a specified scenario
function addSimulationInfo(id) {
    let totalDeaths = 0
    let leverCount = scenariosInformation[id].leverPullCount
    let track = whichTrack(leverCount)

    // Adjust total deaths based on the scenario and track configuration.
    // determines how many people have died based off of the scenario and which track the trolley is on
    switch (id) {
        case "trolleyProblem_1":
            totalDeaths += (track === "Top") ? 3 : 1;
            break;

        case "trolleyProblem_2":
            totalDeaths += (track === "Top") ? 1 : 3;
            break;

        case "trolleyProblem_3":
            totalDeaths += 1;
            break;
            
        case "trolleyProblem_4":
            totalDeaths += 1;
            break;
    }
    // Update the peopleHit and position properties in the scenariosInformation object
    scenariosInformation[id].peopleHit = totalDeaths;
    scenariosInformation[id].position = track;
}

// Calculates and displays results based on simulation scenarios and lever positions
function Results() {
    // Array of all scenario IDs
    const ids = ["trolleyProblem_1", "trolleyProblem_2", "trolleyProblem_3", "trolleyProblem_4"];
    
    // Initialise variables for total deaths, trolley position count, and results element
    let totalDeaths = 0
    let positionCount = 0
    let resultsElement = document.getElementById("results");

    // Initial text for result display
    let returnText = "<p style='font-size: 50px;'>Results:</p><br>"
    let basicReturnText = returnText + "<p style='font-size: 30px;'>You're' a... <span style='color: rgb(13, 47, 134);'>"

    // Iterate through scenario IDs to calculate total deaths and trolley positions
    for (const id of ids) {
        if (!scenariosInformation[id]) {
            console.log("FILL IN THE THINGS FIRST")
            return;
        }
        totalDeaths += scenariosInformation[id].peopleHit
        if (scenariosInformation[id].position === "Bottom") {
            positionCount += 1
        }
    }

    // Text frame for the font small text size and for total deaths
    let smallText = "<p style='font-size: 30px;'>"
    let deathMessage = smallText + "Total deaths = <span style='color: red;'>"

    // Display results based on trolley positions and total deaths
    if (positionCount === 4) {
        resultsElement.innerHTML = basicReturnText + "bystander.</span></p>" + deathMessage + totalDeaths + "</span></p>";
    }
    else if (totalDeaths === 8) {
        resultsElement.innerHTML = basicReturnText + "sadist.</span></p>" + deathMessage + totalDeaths + "</span></p>";
    }
    else if (totalDeaths === 4) {
        resultsElement.innerHTML = basicReturnText + "totalitarian.</span></p>" + deathMessage + totalDeaths + "</span></p>";
    }
    else {
        // Initialise of dead children and pensioners
        let deadChild = 0;
        let deadPensioner = 0;

        // check trolley positions to count the number of dead children and pensioners
        if (scenariosInformation[ids[2]].position === "Bottom") {
            deadChild += 1;
        } else {
            deadPensioner += 1;
        }
        if (scenariosInformation[ids[3]].position === "Bottom") {
            deadPensioner += 1;
        } else {
            deadChild += 1;
        }

        // Display results based on the count of dead children and pensioners
        if (deadChild > deadPensioner) {
            resultsElement.innerHTML = returnText + smallText + "2 children have died.... </p>" + deathMessage + totalDeaths + "</span></p>";
        }
        else if (deadPensioner > deadChild) {
            resultsElement.innerHTML = returnText + smallText + "2 pensioners have died.... </p>" + deathMessage + totalDeaths + "</span></p>";
        }
        else {
            resultsElement.innerHTML = returnText + smallText + "the universe is in balance.... </p>" + deathMessage + totalDeaths + "</span></p>";
        }
    }
    
}