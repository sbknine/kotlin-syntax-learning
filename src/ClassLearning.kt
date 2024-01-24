class House (i: Int){
    val color: String = "White"
    val numberOfWindows: Int = 2
    val isForSale: Boolean = false
    var x : Int = 0
    init {
        this.x = i*2
    }
    fun updateColor(newColor: String) {}
}

class Person(var firstName: String, var lastName: String) {
    var fullName: String = ""
        get() = "$firstName $lastName"
        set(value) {
            val components = value.split(" ")
            firstName = components[0]
            lastName = components[1]
            field = value
        }
}
interface Shape {
    fun computeArea() :Double
}

class Circle(val radius: Double): Shape {
    constructor(name: String) : this(1.0)

    override fun computeArea() = Math.PI*radius*radius
    constructor(diameter:Int) : this(diameter / 2.0) {
        println("$diameter in diameter constructor")
    }
    init {
        println("Area: ${Math.PI* radius*radius}")
    }

}

abstract class Food {
    abstract  val kcal: Int
    abstract  val name: String
    fun consume() = println("I'm eating ${name}")
}

class Pizza() : Food() {
    override val kcal = 600
    override val name = "Pizza"
}

fun Int.isOdd(): Boolean {return this % 2 ==1}


enum class Language(var code: String) {
    ENGLISH("en"),
    JAPANESE("ja"),
    KOREAN("ko"),
    RUSSIAN("ru"),
    THAI("th")
}

data class Player(val name: String, val score: Int) {}

object Calculator {
    fun add(n1: Int, n2: Int): Int {
        return n1+n2
    }
}

class PhysicsSystem {
    companion object WorldConstans {
        val gravity = 9.8
        val unit = "metric"
        fun computerForce(mass: Double, accel: Double): Double{
            return mass*accel
        }
    }
}

fun main() {
    val myHouse = House(2)
    println(myHouse.x)

    val c = Circle(6)

    val person = Person("John", "Doe")
    println(person.fullName)
    person.fullName = "Jane Smith"
    println(person.fullName)

    println(c.computeArea())
    Pizza().consume()
    println(3.isOdd())
    val thaiCode = Language.THAI.code
    println(thaiCode)

    val firstPlayer = Player("Lauren", 10)
    println(firstPlayer)

    val bookAuthor = Pair("A","B")
    println(bookAuthor.first)

    val bookAuthorYear = Triple("A","B",4)
    println(bookAuthorYear)
    println(bookAuthorYear.third)

    val bookAuth1 = "A".to("B")
    println(bookAuth1)

    val map = mapOf(1 to "x", 2 to "y", 3 to "zz")
    println(map)

    println(Calculator.add(2,4))

    println(PhysicsSystem.WorldConstans.gravity)
    println(PhysicsSystem.WorldConstans.computerForce(10.0, 10.0))
}
