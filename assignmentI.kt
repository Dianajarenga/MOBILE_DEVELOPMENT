fun main() {
    var gari = Car("Rolce Royce", "Ghost", "Gold", 4)
    println(gari.capacity)
    gari.carry(10)
    gari.identity()
    gari.calculateParkingFees(8)
    var basi = Bus("toyota", "tour", "white", 40)
    basi.maxTripFare(100.00)
    basi.calculateParkingFees(7)


}

open class Car (var make:String, var model:String, var color:String, var capacity:Int) {

  open  fun carry(people: Int) {
        val people = 10

        if (people <= capacity)
            println("carrying $people passengers")
        else {
            var x = (people) - capacity
            println("over capacity by $x")
        }
    }


    fun identity() {

        println("I am an $color $make $model")
    }


   open fun calculateParkingFees(hours: Int):Int {
        var parkingFees = hours * 20
        println(parkingFees)
       return parkingFees
    }
}
class Bus(make: String,model: String,color: String,capacity: Int):Car(make, model, color, capacity){
    fun maxTripFare(fare:Double,):Double{
       var maxTripFare= fare* capacity
        return maxTripFare
        println(maxTripFare)
    }
    override fun calculateParkingFees(hours: Int): Int {
    return super.calculateParkingFees(hours)*capacity
}
}



