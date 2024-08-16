package Functions

fun main(args: Array<String>) {

    println(sum3(50, 30))
    var r = sum3(39, 61)
    println(r)
    var add = 20 + sum3(90, 50)
    println(add)

}

fun sum3(a:Int , b:Int):Int {
    var sum = a+b
    return sum

}