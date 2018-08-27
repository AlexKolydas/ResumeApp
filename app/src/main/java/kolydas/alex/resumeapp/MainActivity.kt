package kolydas.alex.resumeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workHistory =findViewById<Button>(R.id.workBtn)

        workHistory.setOnClickListener{
            //Moves to next activity
            var workHistory=Intent(getApplicationContext(),WorkExperience::class.java)
            startActivity(workHistory)


        }
    }
}
