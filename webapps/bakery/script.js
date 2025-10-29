function calculateSubtotal() {
    const quantityInput = document.getElementById("quantity").value.trim();
    const priceInput = parseFloat(document.getElementById("price").value);
    const result = document.getElementById("result");

    if (isNaN(priceInput) || priceInput <= 0) {
        result.textContent = "Please enter a valid price.";
        result.style.color = "red";
        return;
    }

    let quantity;

    // Convert 'dozen' to 12
    if (quantityInput.toLowerCase() === "dozen") {
        quantity = 12;
    } else {
        quantity = parseInt(quantityInput);
    }

    if (isNaN(quantity) || quantity <= 0) {
        result.textContent = "Please enter a valid quantity.";
        result.style.color = "red";
        return;
    }

    const subtotal = quantity * priceInput;
    result.textContent = `Subtotal = ${subtotal}`;
    result.style.color = "green";
}