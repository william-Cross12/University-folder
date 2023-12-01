function pullLever(scenarioId) {
    const trolley = document.getElementById('trolley');
    trolley.style.bottom = trolley.style.bottom === '30px' ? '130px' : '30px';
}


function startTrolley(scenarioId) {
    const trolley = document.getElementById('trolley');

    for (let pos = 10; pos <= 300; pos++) {
        moveTrolley(pos,  trolley);
    }
}

function moveTrolley(pos, trolley) {
    setTimeout(() => {
        trolley.style.left = pos + "px";
        if (pos === 140) {
            hitPerson(trolley);
        }
    }, pos * 10);
}

function hitPerson(trolley) {
    const trolleyPosition = parseInt(trolley.style.bottom);
    const rows = document.querySelectorAll('.row');

    rows.forEach((row) => {
        const rowId = row.id;

        if (trolleyPosition === 30 && rowId === "row1") {
            // Trolley is on the bottom track
            row.style.backgroundColor = 'red';
        } 
        if (trolleyPosition === 130 && rowId === "row2") {
            // Trolley is on the top track
            row.style.backgroundColor = 'red';
        }
    });
}


function reset(scenarioId) {
    // Reset trolley
    const trolley = document.getElementById('trolley');
    trolley.style.left = '10px'; // Set the initial left position
    trolley.style.bottom = '30px';
    trolley.style.backgroundColor = 'purple'; // Set the initial background color

    // Reset rows
    const rows = document.querySelectorAll('.row');
    rows.forEach((row) => {
    row.style.backgroundColor = 'blue'; // Set the initial background color
    });
}


