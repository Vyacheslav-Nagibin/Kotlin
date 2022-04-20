fun main(args: Array<String>) {
    var x = 10
    val y = x * 12
    val z = x + y

    while(x < y) {
        println("It's too early to finish cycle")
        x += 20
    }

    println("Cycle is finished!")

    for(i in 1..10) {
        println("Code is executing...")
    }

    //It's my first steps in Kotlin
}