fun main(args: Array<String>) {
    println("Hello ${args[0]}")
    printHello("K")
    drive("slow")
    println(double(2))
    println(doubleCompact(3))

    //lambdas
    var dirtLevel = 20
    // val waterFilter = {level: Int -> level /2}
    val waterFilter: (Int) -> Int = {level -> level /2}
    println(waterFilter(dirtLevel))

    val enc1: (String) -> String = { input -> input.toUpperCase() }
    fun enc2(input: String): String = input.reversed()
    println(encodeMsg("test", enc1))
    println(encodeMsg("test", ::enc2))

    val color = listOf("red","blue","green")
    println(color.filter { it == "red" }) //eager
    val filterled = color.asSequence().filter { it == "blue" }
    println(filterled) //Lazy
    println(filterled.toList()) //Lazy

    val numberSets = listOf(setOf(1,2,3), setOf(4.5), setOf(1,2))
    println(numberSets.flatten())
}
fun printHello(name: String?): Unit {
    println("Hello $name")
}

//default value args
fun drive(speed: String = "fast"){
    println("driving $speed")

}//compact fun
fun double(x:Int):Int {
    return x*2
}
fun doubleCompact(x:Int):Int = x*2

fun encodeMsg(msg: String, encode: (String) -> String): String {
    return encode(msg)
}