package Loop

fun main(args: Array<String>) {
    var fact = 1
    for (i in 1 ..5){
        fact *= i
        println(fact)
    }
    println(fact)
}