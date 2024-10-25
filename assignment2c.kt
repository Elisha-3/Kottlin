fun main(){
    val temperature:Int=30
    if(temperature<=0){
        println("Freezing")
    }
    else if(temperature>0 && temperature<16){
        println("Cold")
    }
    else if(temperature>15 && temperature<=25){
        println("Moderate")
    }
    else if(temperature>25 && temperature<=35){
        println("Warm")
    }
    else if(temperature>35){
        println("Hot")
    }
    else{
        println("Invalid temperature")
    }
}