import java.io.File
import java.util.Stack

fun main(args: Array<String>) {
    println("This class is being ran")
    var priorities = 0

    File("src/main/resources/Day3.txt").forEachLine{
        val halfPoint = (it.length/2)
        val stack: Stack<Char> = Stack<Char>()
        for(letter in it.substring(0, halfPoint)){
            for(letter2 in it.substring(halfPoint, it.length)){
                if(letter2 == letter){
                    if(letter2.isUpperCase()){
                        if(!stack.contains(letter2)){
                            stack.add(letter2)
                            priorities += (letter2.code - 38)
                        }
                    } else {
                        if(!stack.contains(letter2)){
                            stack.add(letter2)
                            priorities += (letter2.code - 96)
                        }
                    }
                }
            }
            if(!it.iterator().hasNext() ){
                stack.clear()
            }
        }
    }
    println(priorities)
}