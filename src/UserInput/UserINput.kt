package UserInput

import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var a = scan.nextInt()
    var b = scan.nextInt()

//    var a = readLine()!!.toInt()
//    var b = readLine()!!.toInt()

    var sum = a+b
    println(sum)
}