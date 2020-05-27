import m.example.rockpaperscissors.Player
import org.junit.Assert.assertEquals
import org.junit.Test

class PlayerTest {
    @Test
    fun `user input is stored`() {
        val newPlayer = Player()
        newPlayer.chooseMove("Rock")
        val output = newPlayer.move
        assertEquals("Rock", output)
    }
}