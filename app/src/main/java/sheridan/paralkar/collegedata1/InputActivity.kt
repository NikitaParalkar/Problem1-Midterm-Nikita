package sheridan.paralkar.collegedata1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import sheridan.paralkar.collegedata1.OutputActivity.Companion.COLLEGE_INFO
import sheridan.paralkar.collegedata1.databinding.ActivityMainBinding
import sheridan.paralkar.collegedata1.model.CollegeInfo

class InputActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitButton.setOnClickListener{showOutput()}
    }
    private fun showOutput() {
        val studentName = binding.nameInput.text.toString().trim()
        if(studentName.isEmpty()){
            val required = getString(R.string.required)
            Toast.makeText(this, required, Toast.LENGTH_LONG).show()
        }else{
            val programList = resources.getStringArray(R.array.program_list)
            val programLength = programList[binding.programInput.selectedItemPosition]
            val collegeInfo = CollegeInfo(studentName, programLength)
            val arguments = Bundle()
            arguments.putSerializable(COLLEGE_INFO, collegeInfo)

            val intent = Intent(this, OutputActivity::class.java).apply {

            }
            startActivity(intent)
        }
    }


}