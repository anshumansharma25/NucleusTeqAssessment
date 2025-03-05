let player1Total = 0, player2Total = 0, currentScore = 0, activePlayer = 1;

const dice = document.getElementById('dice');
const currentScoreDisplay = document.getElementById('current');
const player1TotalDisplay = document.getElementById('player1Score');
const player2TotalDisplay = document.getElementById('player2Score');
const rollButton = document.getElementById('roll');
const saveButton = document.getElementById('save');
const resetButton = document.getElementById('reset');
const winnerDisplay = document.getElementById('winner');
const player1NameDisplay = document.getElementById('player1');
const player2NameDisplay = document.getElementById('player2');


function rotateDice() {
    const dice = document.querySelector('.dice');

    dice.classList.remove('roll');

    setTimeout(() => {
        dice.classList.add('roll');
    }, 10);
}

function rollDice() {
    
    rollButton.disabled = true;
    rotateDice(); 

    setTimeout(() => {
        let roll = Math.floor(Math.random() * 6) + 1;

        document.getElementById("dice").style.backgroundImage = `url('dice/${roll}.svg')`;
        document.getElementById("dice").style.height="70px";
        document.getElementById("dice").style.width="70px";

        if (roll === 1) {
            currentScore = 0;
            updateUI();
            switchTurn();
        } else {
            currentScore += roll;
        }
        updateUI();
        rollButton.disabled = false;

    }, 500);
}


function saveScore() {
    if (activePlayer === 1) {
        player1Total += currentScore;
        updateUI();
    } else {
        player2Total += currentScore;
        updateUI();
    }
    
    if (player1Total >= 100) {
        winnerDisplay.textContent = `🏆 ${player1NameDisplay.textContent} Wins!`;
        endGame();
        return;
    } 
    if (player2Total >= 100) {
        winnerDisplay.textContent = `🏆 ${player2NameDisplay.textContent} Wins!`;
        endGame();
        return;
    }

    currentScore = 0;
    switchTurn();
    updateUI();
}

function switchTurn() {
    activePlayer = activePlayer === 1 ? 2 : 1;
    updateUI();
}
 

function updateUI() {
    currentScoreDisplay.textContent = currentScore;
    player1TotalDisplay.textContent = player1Total;
    player2TotalDisplay.textContent = player2Total;

    player1NameDisplay.classList.toggle("active-turn", activePlayer === 1);
    player2NameDisplay.classList.toggle("active-turn", activePlayer === 2);
}

function endGame() {
    rollButton.disabled = true;
    saveButton.disabled = true;
}

saveButton.addEventListener('click', saveScore);