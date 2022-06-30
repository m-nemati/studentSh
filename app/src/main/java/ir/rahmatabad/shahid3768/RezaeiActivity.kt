package ir.rahmatabad.shahid3768

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RezaeiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rezaei)
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
    }
}