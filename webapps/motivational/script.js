const quotes = [
    "Believe you can and you're halfway there.",
    "I'm not lazy, I'm on energy-saving mode.",
    "Discipline beats motivation.",
    "Do something today that your future self will thank you for.",
    "I used to think I was indecisive, but now I'm not so sure.",
    "Push yourself, because no one else is going to do it for you.",
    "My bed is a magical place where I suddenly remember everything I forgot to do.",
    "Don't wish for it — work for it.",
    "Success is 1% inspiration and 99% perspiration.",
    "Be stronger than your excuses."
];

const quoteElement = document.getElementById("quote");
const button = document.getElementById("newQuoteBtn");

button.addEventListener("click", () => {
    const randomIndex = Math.floor(Math.random() * quotes.length);
    quoteElement.textContent = quotes[randomIndex];

    // Optional: change text color randomly
    const randomColor = "#" + Math.floor(Math.random() * 16777215).toString(16);
    quoteElement.style.color = randomColor;
});