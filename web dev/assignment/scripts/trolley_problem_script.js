const scenariosInformation = {};

function getScenarioId(element) {
    return element.closest(".scenario").id;
}

function pullLever(element) {
    const scenarioId = getScenarioId(element);
    const trolley = document.getElementById(scenarioId).querySelector(".trolley");
    trolley.style.bottom = trolley.style.bottom === "30px" ? "130px" : "30px";

    if (!scenariosInformation[scenarioId]) {
        scenariosInformation[scenarioId] = {
            leverPullCount: 1,
            peopleHit: 0,
        }
    } else {
        scenariosInformation[scenarioId].leverPullCount++;
    }
}


function startTrolley(element) {
    const scenarioId = getScenarioId(element);
    const trolley = document.getElementById(scenarioId).querySelector(".trolley");

    for (let pos = 10; pos <= 300; pos++) {
        moveTrolley(pos,  trolley, scenarioId);
    }
    if (!scenariosInformation[scenarioId]) {
        scenariosInformation[scenarioId] = {
            leverPullCount: 0,
            peopleHit: 0,
            position: "Bottom",
        }
    }
    addSimulationInfo(scenarioId);
}

function moveTrolley(pos, trolley, scenarioId) {
    setTimeout(() => {
        trolley.style.left = pos + "px";
        if (pos === 140) {
            hitPerson(trolley, scenarioId);
        }
    }, pos * 10);
}

function hitPerson(trolley, scenarioId) {
    const trolleyPosition = parseInt(trolley.style.bottom);
    const rows = document.querySelectorAll("#" + scenarioId + " .row1, #" + scenarioId + " .row2");

    rows.forEach((row) => {
        const isRow1 = row.classList.contains("row1");
        const isRow2 = row.classList.contains("row2");

        if ((trolleyPosition === 30 && isRow1) || (trolleyPosition === 130 && isRow2)) {
            row.style.backgroundColor = "red";
        } else {
            row.style.backgroundColor = "";
        }
    });
}


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

function whichTrack(number) {
    if (number % 2 === 0) {
      return "Bottom";
    } else {
      return "Top";
    }
  }

function addSimulationInfo(id) {
    let totalDeaths = 0
    let leverCount = scenariosInformation[id].leverPullCount
    let track = whichTrack(leverCount)

    switch (id) {
        case "trolleyProblem_1":
            if (track === "Top") {
                totalDeaths += 3;
            } else {
                totalDeaths += 1;
            }
            break;

        case "trolleyProblem_2":
            if (track === "Top") {
                totalDeaths += 1;
            } else {
                totalDeaths += 3;
            }
            break;

        case "trolleyProblem_3":
            totalDeaths += 1;
            break;
            
        case "trolleyProblem_4":
            totalDeaths += 1;
            break;
    }
    scenariosInformation[id].peopleHit = totalDeaths;
    scenariosInformation[id].position = track;

}

function Results() {
    const ids = ["trolleyProblem_1", "trolleyProblem_2", "trolleyProblem_3", "trolleyProblem_4"];
    let totalDeaths = 0
    let positionCount = 0
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
    if (positionCount === 4) {
        console.log("bystander")
    }
    else if (totalDeaths === 8) {
        console.log("sadist")
    }
    else if (totalDeaths === 4) {
        console.log("totalitarian")
    }
    else {
        let deadChild = 0;
        let deadPensioner = 0;
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

        if (deadChild > deadPensioner) {
            console.log("poor child")
        }
        else if (deadPensioner > deadChild) {
            console.log("just 3 days to retirement...")
        }
        else {
            console.log("perfectly balanced")
        }
    }
    
}