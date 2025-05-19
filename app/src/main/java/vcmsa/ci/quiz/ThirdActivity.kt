package vcmsa.ci.quiz

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    private lateinit var scoreEditText: EditText
    private lateinit var feedbackTextView: TextView
    private lateinit var reviewButton: Button
    private lateinit var exitButton: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        scoreEditText = findViewById(R.id.editTextText)
        feedbackTextView = findViewById(R.id.textView3)
        reviewButton = findViewById(R.id.button)
        exitButton = findViewById(R.id.button5)

        val score = intent.getIntExtra("score", 0)
        val incorrectQuestions =
            intent.getStringArrayListExtra("incorrectQuestions") ?: arrayListOf()


        scoreEditText.setText("You scored $score out of 7")


        feedbackTextView.text = if (score > 5) "Great job!" else "Keep practicing!"


        reviewButton.setOnClickListener {
            if (incorrectQuestions.isEmpty()) {
                feedbackTextView.text = "All answers correct! Great job!"
            } else {
                val reviewText = "These are the wrong answers:\n\n" +
                        incorrectQuestions.joinToString("\n\n")
                feedbackTextView.text = reviewText
            }
        }

        exitButton.setOnClickListener {
            finishAffinity()
        }
    }
}
