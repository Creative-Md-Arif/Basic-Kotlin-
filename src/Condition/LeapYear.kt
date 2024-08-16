package Condition

fun main(args: Array<String>) {
    print("Enter a year: ")
    var year = readLine()!!.toInt()
    if (year% 400 == 0 || year%100!=0 && year%4==0){
        println("$year is a leap year")
    } else {
        println("$year is not a leap year")
    }
}