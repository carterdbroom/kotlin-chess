class Knight(val color: Color, val startingPosition: Position, var currentPosition: Position) {

    fun move(endPosition: Position): Unit {
        currentPosition = endPosition
    }

    fun possibleMoves(): MutableList<Position> {

    }
}