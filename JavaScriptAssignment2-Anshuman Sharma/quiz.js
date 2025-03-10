const category = localStorage.getItem("category");
const difficulty = localStorage.getItem("difficulty");
const resultText = document.getElementById("result");

const playerName = localStorage.getItem("player");
document.getElementById("player-name").textContent = playerName;
document.getElementById("player-name").style.color="yellow";


let questionCount;
if (difficulty === "easy") {
    questionCount = 10;
} else if (difficulty === "medium") {
    questionCount = 15;
} else {
    questionCount = 20;
}

const apiUrl = `https://opentdb.com/api.php?amount=${questionCount}&category=${category}&difficulty=${difficulty}&type=multiple`;

let questions = [];
let currentQuestionIndex = 0;
let score = 0; 

fetch(apiUrl)
    .then(response => response.json())
    .then(data => {
        if (data.response_code === 0) {
            questions = data.results;
            console.log("Fetched Questions:", questions);
            displayQuestion();
        } else {
            console.error("Error fetching questions from API");
        }
    })
    .catch(error => console.error("Fetch error:", error));

const questionElem = document.querySelector(".question");
const optionElems = document.querySelector(".option");
const timerElem = document.querySelector(".timer");
const scoreElem = document.getElementById("quiz-score"); 

let timeLeft = 15;
let timer;

function displayQuestion() {
    const currentQuestion = questions[currentQuestionIndex];
    questionElem.innerHTML = currentQuestion.question;

    optionElems.innerHTML = "";
    let allOptions = [...currentQuestion.incorrect_answers, currentQuestion.correct_answer];
    allOptions.sort(() => Math.random() - 0.5);

    allOptions.forEach(option => {
        const button = document.createElement("button");
        button.textContent = option;
        button.addEventListener("click", () => checkAnswer(button, currentQuestion.correct_answer));
        optionElems.appendChild(button);
    });

    startTimer();
}

function startTimer() {
    timeLeft = 15;
    timerElem.textContent = `Time Left: ${timeLeft}s`;
    timer = setInterval(() => {
        timeLeft--;
        timerElem.textContent = `Time Left: ${timeLeft}s`;
        if (timeLeft === 0) {
            clearInterval(timer);
            revealCorrectAnswer();
        }
    }, 1000);
}

function checkAnswer(selectedButton, correctAnswer) {
    clearInterval(timer);
    const selectedAnswer = selectedButton.textContent.trim();
    const allButtons = document.querySelectorAll(".option button");
    const resultText = document.getElementById("result");

    allButtons.forEach(button => {
        if (button.textContent.trim() === correctAnswer) {
            button.style.border = "3px solid green";
        }
        if (button === selectedButton && selectedAnswer !== correctAnswer) {
            button.style.border = "3px solid red";
        }
        button.disabled = true;
    });

    if (selectedAnswer === correctAnswer) {
        score++;
    }

    scoreElem.textContent = `Score: ${score}`;

    setTimeout(() => {
        currentQuestionIndex++;
        if (currentQuestionIndex < questions.length) {
            displayQuestion();
        } else {
            showFinalScore();
        }
    }, 2000);
}

function revealCorrectAnswer() {
    const currentQuestion = questions[currentQuestionIndex];
    const correctAnswer = currentQuestion.correct_answer.trim();
    const allButtons = document.querySelectorAll(".option button");

    allButtons.forEach(button => {
        if (button.textContent.trim() === correctAnswer) {
            button.style.border = "3px solid green";
        }
        button.disabled = true;
    });

    resultText.style.display = "block";
    resultText.textContent = `Time's Up! Correct Answer: ${correctAnswer}`;
    resultText.style.color = "blue";

    scoreElem.textContent = `Score: ${score}`;


    setTimeout(() => {
        resultText.style.display = "none";
        currentQuestionIndex++;
        if (currentQuestionIndex < questions.length) {
            displayQuestion();
        } else {
            showFinalScore();
        }
    }, 2000);
}

function showFinalScore() {
    questionElem.innerHTML = `Quiz Over! Your final score is ${score}/${questions.length}`;
    optionElems.innerHTML = `<button onclick="restartQuiz()">Play Again</button>`;
}

function restartQuiz() {
    score = 0;
    currentQuestionIndex = 0;
    window.location.href = "index.html";
}
