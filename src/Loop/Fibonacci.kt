package Loop


fun main(args: Array<String>) {
    var f = 0
    var s = 1
    var n = 0

    for ( i in 1 ..10){
        println("$f")
        n = f+s
        f = s
        s = n
    }

}