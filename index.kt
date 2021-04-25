import java.util.*
import kotlin.collections.ArrayList

fun main() {
    //oddNums(2)
   // oddNums(99)
    namesArray()
    servingRobot(6)
    servingRobot(5)
    servingRobot(20 )
    numMultiples()

}

//if  statements
//if.. else inside another if else //nesting
fun oddNums(num: Int) {
    for (num in 1..100) {
        if (num % 2 !== 0 && num <= 100)
            println(num)
    }
}
fun namesArray() :Any{
var names=arrayOf("Diana","Sandra","Cate","Loyce","Mitch","Kendi","zillah","Akal","Marie","Wato")
    for (name in names) {
        if (name.length > 5)

        println(name)
    }
    return names}
fun servingRobot(age:Int){
    if (age<6){
        println("Serving milk")
    }
        else if(age <15 && age>=6){
            println("Serving Fanta Orange")
        }
    else
        {
            println("Serving Cocacola")
        }
    }
fun numMultiples() {
    var numbers=1..100
    for (number in  numbers)
    { println(number)}

for (i in numbers){
    if (i%3==0)
    println("Fizz")}
for (i in numbers)
    if (i%5==0){
        println("Buzz")
    }
for (i in numbers)   {
    if (i%3==0 && i%5==0){
        println("FizzBuzz")

    }
}
}







//makedirection in which things should take //determining direction something (our program)takes//to solve a certain problem