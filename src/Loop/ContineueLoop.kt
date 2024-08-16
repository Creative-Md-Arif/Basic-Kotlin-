package Loop

fun main(args: Array<String>) {
    for ( i in 1 ..10){

        if( i == 5 || i == 8){
            if (i%2 == 0){
                break
            }
            continue

        }
        println(i)
    }
}