
fun main(){
     //
    characters()
    //
  var nameAge=  introduction("Diana",21)
    println(nameAge)

    //
    goalLength()
    //
    affirmation()

}


//prints out characters

fun characters() {
    val char = "akirachix"
    print(char[0])
    print(char[3])
    println(char[4])

}
//takes in two parameters and returns a string

fun introduction(name:String, Age:Int):String{
    var nameAge ="Hello my name is $name and I am $Age years old"
    return nameAge


}//prints length of string
fun goalLength(){
    var goal="attainable"
    println(goal.length)




}
// prints  name if...else

fun affirmation(){
    var name="Diana"


    var statement="yap that's me"
    var  statement2="I don't know who that is"
if  (name=="Diana"){
    println(statement)
} else println(statement2)}







