function getScenarioId(element) {
    return element.closest('.scenario').id;
}

function pullLever(element) {
    const scenarioId = getScenarioId(element);
    const trolley = document.getElementById(scenarioId).querySelector('.trolley');
    trolley.style.bottom = trolley.style.bottom === '30px' ? '130px' : '30px';
}


function startTrolley(element) {
    const scenarioId = getScenarioId(element);
    const trolley = document.getElementById(scenarioId).querySelector('.trolley');

    for (let pos = 10; pos <= 300; pos++) {
        moveTrolley(pos,  trolley, scenarioId);
    }
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
    const rows = document.querySelectorAll('#' + scenarioId + ' .row1, #' + scenarioId + ' .row2');

    rows.forEach((row) => {
        const isRow1 = row.classList.contains("row1");
        const isRow2 = row.classList.contains("row2");

        if ((trolleyPosition === 30 && isRow1) || (trolleyPosition === 130 && isRow2)) {
            row.style.backgroundColor = 'red';
        } else {
            row.style.backgroundColor = '';
        }
    });
}


function resetSimulation(element) {
    const scenarioId = getScenarioId(element);

    // Reset trolley
    const trolley = document.getElementById(scenarioId).querySelector('.trolley');
    trolley.style.left = '10px'; // Set the initial left position
    trolley.style.bottom = '30px';
    trolley.style.backgroundColor = 'purple'; // Set the initial background color

    // Reset rows
    const rows = document.querySelectorAll('#' + scenarioId + ' .row1, #' + scenarioId + ' .row2');
    rows.forEach((row) => {
    row.style.backgroundColor = 'blue'; // Set the initial background color
    });
}



// add another trolley problem then make it so that the results are stored in an array of objects to display when a button is clicked