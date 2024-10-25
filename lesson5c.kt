//inheritance in OOP is a concept where where a subclass/child can inherit properties and behaviours from a super class/ parent class
//NB: To inherit from a parent class it must be open

open class animal{
    // functions
    fun walk(){
        println("An animal can walk")
    }
    fun eat(){
        println("An animal can eat")
    }
}
class Cow: animal(){
    // Functions
    fun sleep(){
        println("A cow can sleep")
    }
}
fun main(){
    var mycow = Cow()
    println(mycow.sleep())
    println(mycow.walk())
    println(mycow.eat())


}