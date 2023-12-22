function showAlert(message, type) {
    // Remove any existing alerts
    $('.alert').remove();
  
    // Create a new alert element
    const alertElement = $('<div class="alert alert-dismissible" role="alert"></div>');
    alertElement.addClass(type); // Add the Bootstrap class for the alert type
  
    // Add the message to the alert
    alertElement.text(message);
  
  
    // Append the alert to the container
    $('#alert-container').append(alertElement);
}

function checkCountry() {
    // get all information from the HTML and define count
    let count = 0;
    let resultsElement = document.getElementById("location_results");
    let hiddenCells = document.querySelectorAll(".hidden");

    // Define an array of ids with their correct answers
    let questions = [
        { id: 1, correctAnswer: "USA" },
        { id: 2, correctAnswer: "Spain" },
        { id: 3, correctAnswer: "Scotland" },
        { id: 4, correctAnswer: "England" },
        { id: 5, correctAnswer: "Japan" },
        { id: 6, correctAnswer: "the Netherlands" },
        { id: 7, correctAnswer: "Switzerland" }
    ];

    // Loop through the array and check if the selected answer is correct compared to user inputs
    for (let i = 0; i < questions.length; i++) {
        let question = questions[i];
        let answer = document.getElementById("country_" + question.id).value;

        if (answer === question.correctAnswer) {
            count++;
        }
    }

    if (count == 7) {
        showAlert('You got 7/7 correct! Next Questions!', 'alert-success');
        // Loop through each hidden table cell and make it visible
        hiddenCells.forEach(function(cell) {
            cell.classList.remove("hidden"); // Remove the "hidden" class
        });

        // get the first button
        var firstStage = document.getElementById("firstStage");
        // Add the "hidden" class to the button
        firstStage.classList.add("hidden");

        // removes the FAIL message if they had previously gotten the question wrong
        resultsElement.innerHTML = "";

    } else if (count > 0) {
        // if the user gets some questions right but not all a bootstrap alert shows how many are correct
        showAlert("You only got " + count + "/7 correct.", "alert-warning");
        resultsElement.innerHTML = "<p style='font-size: 50px; color: red;'>FAIL</p>";
    } else {
        // if the user gets all questions wrong a bootstrap alert tells them how bad they are
        showAlert("You only got 0/7 correct. Failure!!", "alert-danger");
        resultsElement.innerHTML = "<p style='font-size: 50px; color: red;'>FAIL</p>";
    }
}


function checkCity() {
    // get the user input from the HTML and define count
    let count = 0;
    let resultsElement = document.getElementById("location_results");

    // Define an array of ids with their correct answers
    let questions = [
        { id: "city1", correctAnswer: "New-York" },
        { id: "city2", correctAnswer: "North" },
        { id: "city3", correctAnswer: "Edinburgh" },
        { id: "city4", correctAnswer: "London" },
        { id: "city5", correctAnswer: "Tokyo" },
        { id: "city6", correctAnswer: "Amsterdam" },
        { id: "city7", correctAnswer: "Geneva" }
    ];

    // Loop through the array and check if the selected answer is correct compared to user inputs
    for (let i = 0; i < questions.length; i++) {
        let question = questions[i];
        let selectedCity = document.querySelector('input[name="' + question.id + '"]:checked').value;

        if (selectedCity === question.correctAnswer) {
            count++;
        }
    }

    if (count == 7) {
        // if the user gets all questions correct a bootstrap alert tells them how smart they are
        showAlert('You got 7/7 correct!', 'alert-success');
        resultsElement.innerHTML = "<p style='font-size: 50px; color: green;'>SUCCESS!!</p>";
    } 
    else if (count > 0) {
        // if the user gets some questions right but not all a bootstrap alert shows how many are correct
        showAlert("You only got " + count + "/7 correct.", "alert-warning");
        resultsElement.innerHTML = "<p style='font-size: 50px; color: red;'>FAIL</p>";
    } else {
        // if the user gets all questions wrong a bootstrap alert tells them how bad they are
        showAlert("You only got 0/7 correct. Failure!!", "alert-danger");
        resultsElement.innerHTML = "<p style='font-size: 50px; color: red;'>FAIL</p>";
    }
}