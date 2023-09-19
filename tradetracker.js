function ready(){
    document.getElementById('backbutton').addEventListener('click', function() {
        console.log("Button clicked!");
        window.location.href = 'http://www.cjstancin.com';
    });
}
document.addEventListener("DOMContentLoaded", ready);