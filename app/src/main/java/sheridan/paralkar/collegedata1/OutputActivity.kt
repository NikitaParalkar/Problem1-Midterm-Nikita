package sheridan.paralkar.collegedata1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sheridan.paralkar.collegedata1.databinding.ActivityOutputBinding
import sheridan.paralkar.collegedata1.model.CollegeInfo

class OutputActivity : AppCompatActivity() {

    companion object{
        const val COLLEGE_INFO = "college_info"
    }

    private lateinit var binding: ActivityOutputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        binding = ActivityOutputBinding.inflate(layoutInflater)
        setContentView(binding.root)

//      val collegeInfo = arguements?.getSerializable(COLLEGE_INFO) as CollegeInfo
//        binding.nameOutput.text = collegeInfo.stdName
//        binding.programOutput.text = collegeInfo.program

        binding.backButton.setOnClickListener {
            intent = Intent(this, InputActivity::class.java)
            startActivity(intent)
        }
    }

}
