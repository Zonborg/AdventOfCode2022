import java.io.File

fun main(args: Array<String>) {
    println("This class is being ran")
    var score = 0
    File("src/main/resources/Day2.txt").forEachLine{
        val rock = Triple("A", "X", "Rock")
        val paper = Triple("B", "Y", "Paper")
        val scissors = Triple("C", "Z", "Scissors")
        val lineResult = it.split(" ")
        val opponent = lineResult.get(0)
        val outcome = lineResult.get(1)
        if (opponent.equals(rock.first)){
            if(outcome.equals("X")){
                score += 3
            } else if (outcome.equals("Y")){
                score += 4
            } else if (outcome.equals("Z")){
                score += 8
            }
        } else if (opponent.equals(paper.first)) {
            if(outcome.equals("X")){
                score += 1
            } else if (outcome.equals("Y")){
                score += 5
            } else if (outcome.equals("Z")){
                score += 9
            }
        } else if (opponent.equals(scissors.first)) {
            if(outcome.equals("X")){
                score += 2
            } else if (outcome.equals("Y")){
                score += 6
            } else if (outcome.equals("Z")){
                score += 7
            }
        }
    }
    println(score)
}