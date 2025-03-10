document.addEventListener("DOMContentLoaded", () => {
    let submit = document.getElementById("submit");
    let alertMsg = document.getElementById('alert');

    function validate() {
        let playerName = document.getElementById("player").value.trim();
        let category = document.getElementById("category").value;
        let difficulty = document.querySelector('input[name="difficulty"]:checked')?.value;

        if (playerName === "") {
            alertMsg.textContent = "Please write your name";
            alertMsg.style.color = "red";
            return;
        }
        else if (!category || document.getElementById("category").selectedIndex === 0) { 
            alertMsg.textContent = "Please choose a category"; 
            alertMsg.style.color = "red";
            return;
        }
        else if (!difficulty) {
            alertMsg.textContent = "Please choose a difficulty";
            alertMsg.style.color = "red";
            return;
        }
        else {
            localStorage.setItem("player", playerName);
            localStorage.setItem("category", category);
            localStorage.setItem("difficulty", difficulty);
            window.location.href = "quiz.html";
        }
    }

    submit.addEventListener("click", validate);
});