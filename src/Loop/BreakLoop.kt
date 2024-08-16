package Loop

fun main(args: Array<String>) {
    for ( i in 1 ..10){
        if( i == 5){
            break
        }
        println(i)
    }
}