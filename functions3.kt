fun main(){
    //Functions with parameters
    //  a function with parameters are functions that takes argument(s) when being called

    fun goingToNarok(packege: String){
        println("I am going to buy a $packege")
        //call the function
        goingToNarok("cow")
    }

    fun addTwo(num1: Int, num2: Int){
        val sum = num1 + num2
        println("The sum is $sum")
    }
    addTwo(50,70)

    fun subTwo(num1: Int, num2: Int){
        val difference= num2 - num1
        println("The difference is $difference")
    }
    subTwo(30,80)

    fun multiplyTwo(num1: Int, num2: Int){
        val product= num1*num2
        println("The product is $product")
    }
    multiplyTwo(30,60)
    
    fun divideTwo(num1: Int, num2: Int){
        val division = num2/num1
        println("The division is $division")
    }
    divideTwo(3,63)
}