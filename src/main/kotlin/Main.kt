fun main() {


var car = Car("BMW","X15","blUE",10)
car.carry(12)
car.identity()
var result = car.calculateParkingFees(14)
println(result)

var bus = BUS("Corolla","opel","blue",14)
var  money= bus.maxTripFare(230.10)
println(money)
var annie= bus.calculateParkingFees(6)
println(annie)

}
open class Car(var make:String, var model:String, var color: String,var capacity:Int){

    fun carry(people:Int){
        var x = (people-capacity)
        if(people<=capacity){
            println("Carrying $people passengers")
        }
        else if (people>capacity){
            println("over capacity by $x people")
        }

    }
    fun identity(){
        println("I am a $color $make $model")


    }
    open fun calculateParkingFees(hours:Int): Int{
        var doit = hours * 20
        return(doit)

    }


}
class BUS(make: String, model: String,color: String,capacity: Int): Car(make,model,color,capacity) {
    fun maxTripFare(fare: Double): Double {
        var amount = capacity * fare
        return amount

    }

    override fun calculateParkingFees(hours: Int): Int {
        var booting = hours * capacity
        return booting
    }

}







