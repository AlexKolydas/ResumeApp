package kolydas.alex.resumeapp

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workHistory =findViewById<Button>(R.id.workBtn)
        var callButton=findViewById<Button>(R.id.callBtn)
        var emailButton=findViewById<Button>(R.id.emailBtn)

        workHistory.setOnClickListener{
            //Moves to next activity
            var workHistoryIntent=Intent(getApplicationContext(),WorkExperience::class.java)
            startActivity(workHistoryIntent)
        }

        callButton.setOnClickListener{
            //call the number
            var phoneUri= Uri.parse("tel:<ENTER YOUR PHONE>")
            var callIntent=Intent(Intent.ACTION_DIAL,phoneUri)
            startActivity(callIntent)
        }

        emailButton.setOnClickListener{
            //send an email into this email
            var emailIntent=Intent(Intent.ACTION_SEND)
            emailIntent.setType("plain/text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL,"<ENTER YOUR EMAIL>")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Nice Resume!")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"I Really enjoy your resume")
            startActivity(emailIntent)


        }
    }
}
