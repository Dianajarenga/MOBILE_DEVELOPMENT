fun main (){
var client=Human("Diana",21,50,"It's a good day to jog")
    client.eat(2)
    client.speak("It's a good day to detox")
    println(client.speech)
    client.birthday(1,)
    var user=User("Diana","Anyoso","jarengadiana@gmail.com", +254713357064,2345)
 println(user.email)
    println(user.phoneNumber)



}
class Human(var name:String, var Age:Int, var weight:Int, var speech:String ) {
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")

        var newWeight = foodWeight + weight
        println(newWeight)}

    fun speak(speech: String) {
        }
    fun birthday(newage:Int){
     var age = newage+  Age
        println(age)

}}data class User(var firstName:String, var lastName:String,var email:String, var phoneNumber:Long, var password:Int)











