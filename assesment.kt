fun main() {

    introduction("Diana", 21)
    dispenser(2)
    dispenser(14)
    dispenser(22)
   multiply(2,3)
    add(7,8)
    modulous(12,6)
}
fun introduction(name:String,age:Int){
  println( "My name is $name and I am $age years old.")


}
fun dispenser(age:Int) {
    if (age <= 6) {
        println("milk")
    }
    if (age > 6 && age <= 15) {
        println("fanta")
    } else {
        println("cocacola")
    }

}



open class Human(var name:String, age: Int, weight)


fun multiply(num1:Int,num2:Int){
    var product=num1*num2
    println(product)

}
fun add(num1: Int,num2: Int){
    var add=num1+num2
    println(add)

}
fun modulous(num1: Int,num2: Int){
    var mod=num1%num2
    println(mod)
}



//fun arrays( name:String):String{
   // var namearray= arrayOf("Diana","Victor","Cynthia","Vee")
    //for (name in namearray){

   // if  (name in namearray<=4)



