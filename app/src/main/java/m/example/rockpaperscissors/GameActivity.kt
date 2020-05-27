package m.example.rockpaperscissors

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import m.example.rockpaperscissors.ui.game.GameFragment


class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, GameFragment.newInstance())
                .commitNow() }


//            val rootView: View =
//                setContentView(R.layout.game_fragment)

            //Define your views
            var rockButton: Button? = null

            //Find your views
            rockButton = findViewById<View>(R.id.rock_button) as Button

            //Assign a listener to your button
            rockButton!!.setOnClickListener { //Start your second activity
                val intent = Intent(this@GameActivity, GameActivity::class.java)
                startActivity(intent)



        }


    }
}
