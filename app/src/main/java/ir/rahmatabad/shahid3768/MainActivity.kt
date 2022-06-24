package ir.rahmatabad.shahid3768

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var media1: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        media1 = MediaPlayer.create(this, R.raw.hadadian)
        media1.start()
    }

    override fun onStop() {
        media1.stop()
        super.onStop()
    }

    }