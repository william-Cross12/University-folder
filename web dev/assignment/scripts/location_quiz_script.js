function checkCountry() {
    let country_1, country_2, country_3, country_4, country_5, country_6, country_7, count;
    count = 0;
    country_1 = document.getElementById("country_1").value;
    country_2 = document.getElementById("country_2").value;
    country_3 = document.getElementById("country_3").value;
    country_4 = document.getElementById("country_4").value;
    country_5 = document.getElementById("country_5").value;
    country_6 = document.getElementById("country_6").value;
    country_7 = document.getElementById("country_7").value;
    let hiddenCells = document.querySelectorAll(".hidden");

    if (country_1 == "USA") {
        count++;
    }
    if (country_2 == "Spain") {
        count++;
    }
    if (country_3 == "Scotland") {
        count++;
    }
    if (country_4 == "England") {
        count++;
    }
    if (country_5 == "Japan") {
        count++;
    }
    if (country_6 == "the Netherlands" || country_6 == "The Netherlands" || country_6 == "Netherlands") {
        count++;
    }
    if (country_7 == "Switzerland") {
        count++;
    }

    if (count == 7) {
        document.getElementById("results").innerHTML = "congratulations";
        // Loop through each hidden table cell and make it visible
        hiddenCells.forEach(function(cell) {
            cell.classList.remove("hidden"); // Remove the "hidden" class
        });
    } else {
        document.getElementById("results").innerHTML = "very disappointed";
    }
}


function checkCity() {
    // Get the selected city value
    let selectedCity_1 = document.querySelector('input[name="city1"]:checked').value;
    let selectedCity_2 = document.querySelector('input[name="city2"]:checked').value;
    let selectedCity_3 = document.querySelector('input[name="city3"]:checked').value;
    let selectedCity_4 = document.querySelector('input[name="city4"]:checked').value;
    let selectedCity_5 = document.querySelector('input[name="city5"]:checked').value;
    let selectedCity_6 = document.querySelector('input[name="city6"]:checked').value;
    let selectedCity_7 = document.querySelector('input[name="city7"]:checked').value;
    let count = 0;

    if (selectedCity_1 == "New-York") {
        count++;
    }
    if (selectedCity_2 == "North") {
        count++;
    }
    if (selectedCity_3 == "Edinburgh") {
        count++;
    }
    if (selectedCity_4 == "London") {
        count++;
    }
    if (selectedCity_5 == "Tokyo") {
        count++;
    }
    if (selectedCity_6 == "Amsterdam") {
        count++;
    }
    if (selectedCity_7 == "Geneva") {
        count++;
    }

    if (count == 7) {
        document.getElementById("location_results").innerHTML = "Correct";
    } else {
        document.getElementById("location_results").innerHTML = "very disappointed";
    }
}