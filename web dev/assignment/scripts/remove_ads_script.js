function processRemoval() {
    let form = document.getElementById("signUp");
    event.preventDefault();     //prevents page from reloading removing innerHTML
    
    let name = form.name.value;
    let email = form.email.value;
    let address = form.address.value;
    let ni = form.ni.value;
    let cardNumber = form.cardNumber.value;
    
    if (name !== "" && email !== "" && address !== "" && ni !== "" && cardNumber !== "" && isNaN(cardNumber) == false) {
        $(document).ready(function () {
            $('.alert').show()
        });
        let message = ("<h2>Thank you " + name + "!</h2><p>Your request is being processed and will likely take effect in 3 to 4 business days</p><p>in the meantime you will be sent our marketing emails at your email of " + address + ", thanks!</p>");
        document.getElementById("message").innerHTML = message;
    } else {
        document.getElementById("message").innerHTML = ("<h2>YOU MUST FILL IN THE FORM PROPERLY</h2><p>WE HAVE YOUR IP.</p>");
    }
    
    

}