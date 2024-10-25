class fish(){
    val type:String= "Tilapia"
    val weight: Double=3.0
    val length: Double=0.7
    val environment: String= "Fresh Water Lake"

    fun eat(){
        println("Can eat worms")
    }

    fun die(){
        println("Can die, if water is salty")
    }
}

fun main(){
    var myobject = fish()
    println(myobject.type)
    println(myobject.weight)
    println(myobject.length)
    println(myobject.environment)

    println(myobject.eat())
    println(myobject.die())





}