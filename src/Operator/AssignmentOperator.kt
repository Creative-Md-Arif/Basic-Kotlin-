package Operator

fun main(args: Array<String>) {
    var a = 10
    var b = 12

//    a+b -> a=a+b
    a += b
    println(a)

//    a-b -> a=a-b // a=22
    a -= b
    println(a)

//    a*=b -> a=a*b // a=10
    a *= b
    println(a)

//    a/=b -> a=a/b // a=120
    a /= b
    println(a)
//    a%=b -> a=a%b // a=120
    a%=b
    println(a)

}