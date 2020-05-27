package m.example.rockpaperscissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import m.example.rockpaperscissors.ui.game.GameFragment

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, GameFragment.newInstance())
                .commitNow()
        }
    }
}
