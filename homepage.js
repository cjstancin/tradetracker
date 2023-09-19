function ready(){
        document.getElementById('tradetracker').addEventListener('click', function() {
            console.log("Button clicked!");
            window.location.href = 'tradetracker.html';
        });
}
document.addEventListener("DOMContentLoaded", ready);