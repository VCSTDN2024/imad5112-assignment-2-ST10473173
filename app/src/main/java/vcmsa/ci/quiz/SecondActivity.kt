package vcmsa.ci.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private val questions = listOf(
        "The Great Wall of China was built in a single dynasty." to false,
        "The Titanic sank on its maiden voyage." to true,
        "World War I began in 1914." to true,
        "The Berlin Wall fell in 1989." to true,
        "The Union of South Africa was formed in 1948." to false,
        "Apartheid officially ended in 1990." to false,
        "Nelson Mandela was South Africa's first Black president." to true
    )

    private var currentQuestionIndex = 0
    private var score = 0
    private val incorrectQuestions = mutableListOf<String>()
    private var answerSelected = false
    private var selectedAnswer: Boolean? = null

    private lateinit var questionTextView: TextView
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        questionTextView = findViewById(R.id.textView4)
        trueButton = findViewById(R.id.button2)
        falseButton = findViewById(R.id.button3)
        nextButton = findViewById(R.id.button4)

        setQuestion()

        trueButton.setOnClickListener {
            selectedAnswer = true
            answerSelected = true
        }

        falseButton.setOnClickListener {
            selectedAnswer = false
            answerSelected = true
        }

        nextButton.setOnClickListener {
            if (!answerSelected) {
                Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val correctAnswer = questions[currentQuestionIndex].second
            if (selectedAnswer == correctAnswer) {
                score++
                showToast(true)
            } else {
                incorrectQuestions.add(questions[currentQuestionIndex].first)
                showToast(false)
            }
        }
    }

    private fun setQuestion() {
        questionTextView.text = questions[currentQuestionIndex].first
        answerSelected = false
        selectedAnswer = null
    }

    private fun showToast(isCorrect: Boolean) {
        val message = if (isCorrect) "Correct!" else "Incorrect!"
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()


        currentQuestionIndex++
        if (currentQuestionIndex < questions.size) {
            setQuestion()
        } else {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("score", score)
            intent.putStringArrayListExtra("incorrectQuestions", ArrayList(incorrectQuestions))
            startActivity(intent)
            finish()
        }
    }
}
