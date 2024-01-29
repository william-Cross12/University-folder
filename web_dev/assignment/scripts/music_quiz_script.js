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

function checkAnswers() {
    // get all information from the HTML and define count
    let count = 0;
    let resultsElement = document.getElementById("results");

    // Define an array of ids with their correct answers
    let questions = [
        { id: "q1", correctAnswer: "2" },
        { id: "q2", correctAnswer: "5" },
        { id: "q3", correctAnswer: "1" },
        { id: "q4", correctAnswer: "3" },
        { id: "q5", correctAnswer: "4" }
    ];

    // Loop through the array and check if the selected answer is correct compared to user inputs
    for (let i = 0; i < questions.length; i++) {
        let question = questions[i];
        let selectedAnswer = document.getElementById(question.id).value;

        if (selectedAnswer === question.correctAnswer) {
            count++;
        }
    }

    if (count == 5) {
        // if the user gets all questions correct a bootstrap alert tells them how smart they are
        showAlert('You got 5/5 correct!', 'alert-success');
        resultsElement.innerHTML = "<p style='font-size: 50px; color: green;'>SUCCESS!!</p>";
    } 
    else if (count > 0) {
        // if the user gets some questions right but not all a bootstrap alert shows how many are correct
        showAlert("You only got " + count + "/5 correct.", "alert-warning");
        resultsElement.innerHTML = "<p style='font-size: 50px; color: red;'>FAIL</p>";
    } else {
        // if the user gets all questions wrong a bootstrap alert tells them how bad they are
        showAlert("You only got 0/5 correct. Failure!!", "alert-danger");
        resultsElement.innerHTML = "<p style='font-size: 50px; color: red;'>FAIL</p>";
    }
}