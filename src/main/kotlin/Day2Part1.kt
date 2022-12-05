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
        val player = lineResult.get(1)
        if (opponent.equals(rock.first)){
            if (player.equals(rock.second)){
                score += 4
            } else if (player.equals(paper.second)){
                score += 8
            } else if (player.equals(scissors.second)) {
                score += 3
            }
        } else if (opponent.equals(paper.first)) {
            if(player.equals(rock.second)){
                score += 1
            } else if (player.equals(paper.second)){
                score += 5
            } else if (player.equals(scissors.second)) {
                score += 9
            }
        } else if (opponent.equals(scissors.first)) {
            if(player.equals(rock.second)){
                score += 7
            } else if (player.equals(paper.second)){
                score += 2
            } else if (player.equals(scissors.second)) {
                score += 6
            }
        }
    }
    println(score)
}