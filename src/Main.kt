import java.util.*

fun main() {
    println("Hello World!")

    val i: Int = 6
    val b1 = i.toByte()
    println(b1)

    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    //var can assign but val can't
    var num = 10
    num = 30
    println(num)

    val numOfStudent = 50
    if(numOfStudent in 1..100) { //in range of alphabet is acceptable like 'd'..'g'
        println(true)
    }

    //similar to switch case
    when (num) {
        0 -> println("No")
        in 1..39 -> {
            num = 60
            println("Yes")
        }
        else -> println("Test")
    }
    println(num)

    //normal for i
    val testArr = arrayOf('a', 'b', 'c')
    for (i in testArr.indices) {
        println(i)
    }

    //for i --
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    //for each
    for (element in testArr) {
        println(element)
    }

    //for get index, value
    for((index, value) in testArr.withIndex()) {
        println("Index: $index , Value: $value")
    }

    //while and do while loop is same as Java programming

    repeat(2) {
        println("test")
    }

    //null safety symbol for null !! or ?:
    var number: Int? = 6 // this acceptable for using null
    number = number?.dec() //? check null like TypeScript

    //null pointerexception
    val s = arrayOf('0','1','2')
    // val len = s!!.length

    //if number = null assign 0 to number
    number = number?.dec() ?: 0

    //list

    val myList = mutableListOf("abc","dfg","hij")
    myList.remove("dfg")

    var myList1 = listOf('a','b')

    //array is fixed size
    val pets = arrayOf("dog","cat","bat")
    println(pets.contentToString()) //kotlin toString function

    val numbers = intArrayOf(1,2,3)
    val numbers1 = intArrayOf(4,5,6)
    println(Arrays.toString(numbers+numbers1))

}

