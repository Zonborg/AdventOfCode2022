import java.io.File

fun main(args: Array<String>) {
    println("This class is being ran")
    var total = 0
    var highest = 0
    File("src/main/resources/Day1.txt").forEachLine{
        if(it.equals("")){
            if(total > highest){
                highest = total
            }
            total = 0
        } else {
            total += Integer.parseInt(it)
        }
    }
    println(highest)
}