fun main(){
    println(evenNames(listOf("jarenga","suzzy","Diana","Carol","Cindy","Eunice","Sharon","Sophia","Barbie","Shee")))
    println(peopleHeight(listOf(2.4,4.3,1.2,2.5,5.5)))
    people(Person("Jarenga",18,3.3,59.3))
    var name=cars(listOf(
        Cars("VOLKSWAGEN",45.0),
        Cars("FERRARI",48.0),
        Cars("BUGATTI",38.3),

        ))
    println(name)

}
fun evenNames(names:List<String>):List<String>{
    var names = mutableListOf<String>()
    for (name in names) {
        if (names.indexOf(name) % 2 == 0)
            names.addAll(listOf(name))
    }
    return names
}
fun peopleHeight(height:List<Double>):Pair<Double,Double>{
    var total=height.sum()
    var average=height.average()
    return Pair(total,average)
}
data class AverageTotal(var average:Double,var total:Double) {
    fun peopleHeight(height: List<Double>): AverageTotal {
        var total = height.sum()
        var avr = height.average()
        var avrtotal = AverageTotal(average, total)
        return avrtotal
    }
}
data class Persons(var name:String,var age:Int,var height:Double,var weight:Double )
fun  people (people:Person){
    var people= listOf(Person("Loyce",18,3.3,59.6),
        Person("veronica",19,3.1,40.6),
        Person("Barbie",20,4.4,70.6),
        Person("Diana",21,3.3,59.6)
    )
    var descendingSortedPeople=people.sortedByDescending{it.age }
    println(descendingSortedPeople)



}
data class People(var name:String,var age:Int,var height:Double,var weight:Double )
fun people(people:List<Persons>):List<Persons> {
    var People = mutableListOf<Persons>()
    Persons("Vee", 18, 3.3, 59.6)
    Persons("Dee", 19, 3.1, 40.6)
    Persons("Bee", 20, 4.4, 70.6)
    Persons("Zee", 21, 3.3, 59.6)
    People.addAll(listOf(
        (Persons("Renee", 22, 4.5, 61.4)),
        Persons("Roy", 23, 4.5, 67.9)
    )
    )

    return people
}
data class Cars(var registration: String, var mileage: Double)

fun cars(vehicle: List<Cars>):Double {
    var totalMileage = 0.0
    for (car in vehicle) {
        totalMileage += totalMileage
    }
    var average = totalMileage / vehicle.count()
    return average
}







