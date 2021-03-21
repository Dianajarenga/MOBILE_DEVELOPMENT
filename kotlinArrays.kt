import java.lang.reflect.Array
import java.util.*

    fun main(){
    commands()
    city()
    integers()
    names()
}

   fun commands(){
   //takes in 4 strings //creates an array //prints
    var commandsArray=arrayOf("rewind","pause","play","forward")
    println(Arrays.toString(commandsArray))

}

   fun city(){

   //prints out the names of the cities in the correct grammatical case.
   var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")

   for(city in cities){
   println(city.capitalize())
    }


//
}   fun integers (){
    //prints sum of two elements


    var numArray = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var total=numArray[1].plus(numArray[4])
    println(total)

    //prints index

    println(numArray.indexOf(158))

    //prints in ascending order
    var sortedNums = numArray.sortedArray()

    println(Arrays.toString(sortedNums))


}
    //prints arrayOf 3names
    fun names (){
    var namesArray = arrayOf("Diana", "Samuel", "Peggy", )
    println(Arrays.toString(namesArray))

 }

