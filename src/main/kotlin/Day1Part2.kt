import java.io.File

fun main(args: Array<String>) {
    println("This class is being ran")
    var total = 0
    val elfCalories = ArrayList<Int>()
    File("src/main/resources/Day1.txt").forEachLine{
        if(it.equals("")){
            elfCalories.add(total)
            total = 0
        } else {
            total += Integer.parseInt(it)
        }
    }
    var threeMost = 0;
    elfCalories.sortDescending()
    elfCalories.take(3).forEach(){
        threeMost+=it
    }
    println(threeMost)
}