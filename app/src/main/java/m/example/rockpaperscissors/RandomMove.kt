package m.example.rockpaperscissors

class RandomMove(private val possibleMoves: List<String>) {

    fun main(): String {
        return possibleMoves.random()
    }


}