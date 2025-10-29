function showMessage() {
    const message = document.getElementById("message");
    message.textContent = "Thank you for clicking! Enjoy browsing.";
}

function validateEmail() {
    const emailInput = document.getElementById("email");
    const email = emailInput.value.trim();

    // Simple validation check
    if (email.indexOf("@") === -1 || email.indexOf(".") === -1) {
        alert("Invalid email address. Please include '@' and '.' characters.");
        emailInput.focus();
        return false;
    } else {
        alert("Thank you for subscribing!");
        return true;
    }
}