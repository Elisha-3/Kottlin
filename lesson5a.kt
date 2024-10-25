//Objects and Classes are essential building blocks for object oriented programing(OOP)
//A class is a blue print for creating objects
//A class defines the properties and functions(behaviors) that the object created will have.
//An object is  an instance of a class meaning an object is a specific object created with that class blue print

class person{
    //properties
    val name: String= "Keanche"
    val title: String= "Mr."
    val age: Int = 28
    //val gender: String: "Male"
    val weight: Double= 61.5
    val height: Double= 160.0
    val color: String= "dark"
    val field: String= "Software Developer"
    val ethinicity: String= "Kisii"
    val residence: String= "Wangige"

//Functions/Behaviours of a person
fun speak(){
    println("I am talking")
}
fun eat(){
    println("I am eating a banana")
}
fun run(){
    println("I can run 10km")
}
fun walk(){
    println("I walk 5km a day")
}
fun read(){
    println("I do read journals")
}
fun joke(){
    println("I make jokes oftenly")
}
fun love(){
    println("I fall in love once")
}
fun calculate(){
    println("I calculate simple arithmetics")
}
fun learn(){
    println("I learn new concepts everyday")
}
}

fun main(){
    // create an object using person class and store the value in a variable
    var myobject = person()
    println(myobject.name)
    println(myobject.age)
    println(myobject.weight)
    println(myobject.ethinicity)

    println(myobject.speak())
    println(myobject.calculate())
    println(myobject.learn())




}