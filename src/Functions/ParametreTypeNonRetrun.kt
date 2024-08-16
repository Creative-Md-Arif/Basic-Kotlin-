package Functions

fun main(args: Array<String>) {
    sum2(20, 40)
    sum2(40, 50)
    sum2(100, 20)
}

fun sum2(a: Int, b: Int) {
    var sum = a + b
    println("Sum of $a and $b is $sum")
}