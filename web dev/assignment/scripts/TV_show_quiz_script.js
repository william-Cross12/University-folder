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
    let q1, q2, q3, q4, q5, q6, count;
    let resultsElement = document.getElementById("results");
    count = 0;
    q1 = document.getElementById("q1").value;
    q2 = document.getElementById("q2").value;
    q3 = document.getElementById("q3").value;
    q4 = document.getElementById("q4").value;
    q5 = document.getElementById("q5").value;
    q6 = document.getElementById("q6").value;

    if (q1 == 3) {
        count++;
    }
    if (q2 == 2) {
        count++;
    }
    if (q3 == 5) {
        count++;
    }
    if (q4 == 1) {
        count++;
    }
    if (q5 == 4) {
        count++;
    }
    if (q6 == 3) {
        count++;
    }

    if (count == 6) {
        showAlert('You got 6/6 correct!', 'alert-success');
        resultsElement.innerHTML = "<p style='font-size: 50px; color: green;'>SUCCESS!!</p>";
    } 
    else if (count > 0) {
        showAlert("You only got " + count + "/6 correct.", "alert-warning");
        resultsElement.innerHTML = "<p style='font-size: 50px; color: red;'>FAIL</p>";
    } else {
        showAlert("You only got 0/6 correct. Failure!!", "alert-danger");
        resultsElement.innerHTML = "<p style='font-size: 50px; color: red;'>FAIL</p>";
    }
}