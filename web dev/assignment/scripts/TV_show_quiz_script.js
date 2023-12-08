function checkAnswers() {
    let q1, q2, q3, q4, q5, q6, count;
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
        document.getElementById("results").innerHTML = "congratulations";
    } else {
        document.getElementById("results").innerHTML = "very disappointed";
    }
}