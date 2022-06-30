package ir.rahmatabad.shahid3768

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var media1: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);


        // Play Background Sound
        media1 = MediaPlayer.create(this, R.raw.hadadian)
        media1.start()

        // *********** Define Widgets *************
        val btnShahid1: Button = findViewById(R.id.btn_sh1)
        val btnShahid2: Button = findViewById(R.id.btn_sh2)
        val btnShahid3: Button = findViewById(R.id.btn_sh3)
        val btnShahid4: Button = findViewById(R.id.btn_sh4)
        val btnShahid5: Button = findViewById(R.id.btn_sh5)
        val btnShahid6: Button = findViewById(R.id.btn_sh6)

        // ******** SetOnClick Listener Methods ************
        btnShahid1.setOnClickListener {
            val intent = Intent(this,BarotkobianActivity::class.java )
            startActivity(intent)
        }
        btnShahid2.setOnClickListener {
            val intent = Intent(this,SadeghpourActivity::class.java )
            startActivity(intent)
        }
        btnShahid3.setOnClickListener {
            val intent = Intent(this,TeymoriActivity::class.java )
            startActivity(intent)
        }
        btnShahid4.setOnClickListener {
            val intent = Intent(this,GolabiActivity::class.java )
            startActivity(intent)
        }
        btnShahid5.setOnClickListener {
            val intent = Intent(this,KhaliliActivity::class.java )
            startActivity(intent)
        }
        btnShahid6.setOnClickListener {
            val intent = Intent(this,RezaeiActivity::class.java )
            startActivity(intent)
        }

    }  // ********  end of onCreate Method *********

    override fun onStop() {
        //media1.stop()
        super.onStop()
    } // ********  end of onStop Method *********

    override fun onPause() {
        Toast.makeText(this, "PPPPauuse", Toast.LENGTH_SHORT).show()
        media1.pause()
        super.onPause()
    }
    override fun onResume() {
        Toast.makeText(this, "REEEEE", Toast.LENGTH_SHORT).show()
        media1.start()
        super.onResume()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true

    }
} // ********  end of Class MainActivity *********