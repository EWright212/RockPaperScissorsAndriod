package m.example.rockpaperscissors

class Game(private var player1: Player, private var player2: Player) {


    val listOfMoves: List<String> = listOf("Rock", "Paper", "Scissors")

    fun computerMove(randomMove: String): String {
        return randomMove
    }

    fun calculateWinner(): Any {
        if (player1.move == "Rock" && player2.move == "Scissors") {
            return player1
        } else if (player1.move == "Paper" && player2.move == "Scissors") {
            return player2
        } else if (player1.move == "Rock" && player2.move == "Paper") {
            return player2
        } else if (player2.move == "Paper" && player1.move == "Scissors") {
            return player1
        } else if (player2.move == "Rock" && player1.move == "Paper") {
            return player1
        } else if (player2.move == "Rock" && player1.move == "Scissors") {
            return player2
        } else {
            return "Draw"
        }

    }

}
