package m.example.rockpaperscissors



import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test

//import org.junit.Assert.assertEquals

    class GameTest {
//    @Test
//    fun `computer move`() {
//        val newGame = Game(Player(),Player())
//
//        //Mock random move
//        val output = newGame.computerMove(RandomMove(newGame.listOfMoves).main())
//        assertEquals("Rock", output)
//    }

        @Test
        fun `calculate winner - Rock beats Scissors p1 Wins`() {
            val playerMock1 = mockk<Player>()
            val playerMock2 = mockk<Player>()
            val newGame = Game(playerMock1,playerMock2)

            every { playerMock1.move } returns "Rock"
            every { playerMock2.move } returns "Scissors"

            val output = newGame.calculateWinner()
            assertEquals(playerMock1, output)
        }
        @Test
        fun `calculate winner - Rock beats Scissors p2 Wins`() {
            val playerMock1 = mockk<Player>()
            val playerMock2 = mockk<Player>()
            val newGame = Game(playerMock1,playerMock2)

            every { playerMock2.move } returns "Rock"
            every { playerMock1.move } returns "Scissors"

            val output = newGame.calculateWinner()
            assertEquals(playerMock2, output)
        }
        @Test
        fun `calculate winner - Paper beats Rock p1 Wins`() {
            val playerMock1 = mockk<Player>()
            val playerMock2 = mockk<Player>()
            val newGame = Game(playerMock1,playerMock2)

            every { playerMock2.move } returns "Rock"
            every { playerMock1.move } returns "Paper"

            val output = newGame.calculateWinner()
            assertEquals(playerMock1, output)
        }

        @Test
        fun `calculate winner - Paper beats Rock p2 Wins`() {
            val playerMock1 = mockk<Player>()
            val playerMock2 = mockk<Player>()
            val newGame = Game(playerMock1,playerMock2)

            every { playerMock1.move } returns "Rock"
            every { playerMock2.move } returns "Paper"

            val output = newGame.calculateWinner()
            assertEquals(playerMock2, output)
        }

        @Test
        fun `calculate winner - Scissors beats Paper P2 Wins`() {
            val playerMock1 = mockk<Player>()
            val playerMock2 = mockk<Player>()
            val newGame = Game(playerMock1,playerMock2)

            every { playerMock1.move } returns "Paper"
            every { playerMock2.move } returns "Scissors"

            val output = newGame.calculateWinner()
            assertEquals(playerMock2, output)
        }

        @Test
        fun `calculate winner - Scissors beats Paper P1 Wins`() {
            val playerMock1 = mockk<Player>()
            val playerMock2 = mockk<Player>()
            val newGame = Game(playerMock1,playerMock2)

            every { playerMock2.move } returns "Paper"
            every { playerMock1.move } returns "Scissors"

            val output = newGame.calculateWinner()
            assertEquals(playerMock1, output)
        }

        @Test
        fun `calculate winner - Paper draws Paper`() {
            val playerMock1 = mockk<Player>()
            val playerMock2 = mockk<Player>()
            val newGame = Game(playerMock1,playerMock2)

            every { playerMock2.move } returns "Paper"
            every { playerMock1.move } returns "Paper"

            val output = newGame.calculateWinner()
            assertEquals("Draw", output)


    }