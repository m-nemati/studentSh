package ir.rahmatabad.shahid3768

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView
import java.util.*
import kotlin.concurrent.timerTask

class SplashActivity : AppCompatActivity() {

    private lateinit var media: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Define widgets
        val image:CircleImageView = findViewById(R.id.profile_image)
        val title1: TextView = findViewById(R.id.txt_title1)
        val title2: TextView = findViewById(R.id.txt_title2)

        // Define Animations
        val animationLeft = AnimationUtils.loadAnimation(this, R.anim.move_left)
        val animationRight = AnimationUtils.loadAnimation(this, R.anim.move_right)

        media = MediaPlayer.create(this, R.raw.splashsound)
        media.start()

        // Set Animations
        title1.animation = animationLeft
        title2.animation = animationRight

        // Go to Main Activity
        Timer().schedule(timerTask {
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish() // Close Splash Activity
        }, 7000)

    } // end of onCreate

    override fun onStop() {
        media.stop()
        super.onStop()
    }
}