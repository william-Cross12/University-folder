function checkAnswers() {
    let q1, q2, q3, q4, q5, count;
    count = 0;
    q1 = document.getElementById("q1").value;
    q2 = document.getElementById("q2").value;
    q3 = document.getElementById("q3").value;
    q4 = document.getElementById("q4").value;
    q5 = document.getElementById("q5").value;

    if (q1 == 2) {
        count++;
    }
    if (q2 == 5) {
        count++;
    }
    if (q3 == 1) {
        count++;
    }
    if (q4 == 3) {
        count++;
    }
    if (q5 == 4) {
        count++;
    }

    if (count == 5) {
        document.getElementById("results").innerHTML = "congratulations";
    } else {
        document.getElementById("results").innerHTML = "very disappointed";
    }
}