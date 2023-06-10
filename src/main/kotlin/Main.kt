//--------------------------------Companion Object---------------------------

/*class Myobject{
    object MyObject{
        fun f(){
            println("kuch bhi")
        }

    }
    companion object My1Object{
        fun g(){
            println("kuch bhi 2")
        }

    }
}
fun main(){
    Myobject.MyObject.f()
    Myobject.g()
}*/
//---------------------------------------------------------------------------------------
/*class Person {
    companion object {
        val defaultAge = 25
    }
}
fun main() {
    println("Default Age: ${Person.defaultAge}")
}
//--------------------------------------------------------------------------------------
class MathUtils {
    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }
}

fun main() {
    val num1 = 10
    val num2 = 5
    val sum = MathUtils.add(num1, num2)
    println("Sum: $sum")
}*/
//------------------------------------------Data Classes-----------------------------------
/*data class Person(val id : Int, val name: String){

}
fun main(){
    val p1 = Person(1, "fef")
    val p2 = Person(1, "feddf")
    println(p1)
    println(p2)
    println(p1.hashCode())
    println(p1 == p2)
    val p3 =p1.copy(3)
    println(p3)
    val(id, name) = p1
    println(id)
    println(name)


}*/
//---------------------------------------------------------------------------------------------------
/*
data class Book(val name: String, val publisher: String, var reviewScore: Int)

fun main() {

    val book = Book("Kotlin", "Tutorials Point", 10)

    println("Name = ${book.name}")
    println("Publisher = ${book.publisher}")
    println("Score = ${book.reviewScore}")

}*/
//------------------------------------------------------------------------------------------------------
/*data class Book(val name: String, val publisher: String, var reviewScore: Int)

fun main(args: Array<String>) {

    val original = Book("Kotlin", "Tutorials Point", 10)
    val original1 = Book("Kotlin", "Tutorials Point 2.0", 10)
    println(original)
    println(original.hashCode())
    println(original == original)
    val original3 =original.copy("java")
    println(original3)

    val copied = original.copy(reviewScore=5)

    println("Original Book")
    println("Name = ${original.name}")
    println("Publisher = ${original.publisher}")
    println("Score = ${original.reviewScore}")

    println("Copied Book")
    println("Name = ${copied.name}")
    println("Publisher = ${copied.publisher}")
    println("Score = ${copied.reviewScore}")

}*/
//---------------------------------------------------------------------------------------------------------
/*data class Book(val name: String, val publisher: String, var reviewScore: Int)

fun main() {

    val book = Book("Kotlin", "Tutorials Point", 10)

    val( name, publisher,reviewScore ) = book

    println("Name = $name")
    println("Publisher = $publisher")
    println("Score = $reviewScore")

}*/
//----------------------------------------Sealed Classes----------------------------------
/*
sealed class MyExample {
    class OP1 : MyExample() // MyExmaple class can be of two types only
    class OP2 : MyExample()
    class OP3 : MyExample()

}
fun main(args: Array<String>) {
    val obj: MyExample = MyExample.OP2()

    val output = when (obj) { // defining the object of the class depending on the inuputs
        is MyExample.OP1 -> "Option One has been chosen"
        is MyExample.OP2 -> "option Two has been chose"
        is MyExample.OP3 -> "option Three has been chose"


    }

    println(output)
}*/
//------------------------------------Exception Handling-------------------------------------------
fun main(){
    val arr = arrayOf(1,2,3)
    try {
        println(arr[5])
    }
    catch (e:Exception){
        println("Please Check the array Index" )

    }
    finally {
        println("I will Execute no matter what")
    }
    println(" This will not run")
}
