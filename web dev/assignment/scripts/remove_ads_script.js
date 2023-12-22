function processRemoval() {
    // gets form information from the HTML
    let form = document.getElementById("signUp");
    event.preventDefault();     //prevents page from reloading and removing innerHTML
    
    // defines variables from the form information
    let name = form.name.value;
    let email = form.email.value;
    let address = form.address.value;
    let ni = form.ni.value;
    let cardNumber = form.cardNumber.value;
    
    // performs in browser form checks to ensure the data is as accurate as can be
    if (name !== "" && email !== "" && address !== "" && ni !== "" && cardNumber !== "" && isNaN(cardNumber) == false) {
        // if all form information is correct the user is rewarded with a message and a bootstrap alert
        $(document).ready(function () {
            $('.alert').show()
        });
        let message = ("<h2>Thank you " + name + "!</h2><p>Your request is being processed and will likely take effect in 3 to 4 business days</p><p>in the meantime you will be sent daily company updates to your email " + email + ", thanks!</p>");
        document.getElementById("message").innerHTML = message;
    } else {
        // if form information is invalid a warning is presented to the user
        document.getElementById("message").innerHTML = ("<h2>YOU MUST FILL IN THE FORM PROPERLY</h2><p style='color: red;'>WE HAVE YOUR IP.</p>");
    }
}