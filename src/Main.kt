fun main() {
var toyota = Car("Toyota","Mark x","KDD 729K",50)
    var audi = Car("Audii","A3","182Z",60)
    audi.hoot()
    audi.start()
    audi.speed
    audi.deceleration(20)
    audi.speed
    println(audi.speed)
    audi.stop()
    println(audi.speed)
    println(audi.make)
    println(audi.model)
    println(audi.registration)
    println(audi.speed)
    toyota.start()
    toyota.hoot()
    println(toyota.make)
    println(toyota.speed)
    println(toyota.registration)
    println(toyota.model)
    var Nancy = Students("Lucy",12)
    println(Nancy.name)
    println(Nancy.age)

}

class Car(var make:String, var model:String,var registration:String, var speed:Int){
    fun start(){
        println("chang'ing'i,vroom")
    }
    fun acceleration(acceleration:Int):Int{
        speed+=acceleration
        return speed

    }
    fun hoot(){
        println("boooooo")
    }
    fun deceleration(deceleration:Int):Int{
        speed-=deceleration
        return speed
    }
    fun stop() {
        speed=0

    }
}
data class Students(var name: String, var age:Int){

}