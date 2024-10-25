fun main(){
    val weight: Double=61.5
    val height= 1.60

    val BMI:Double= weight/(height*height)

    if(BMI<18.5){
        println("$BMI Underweight")
    }
    else if(BMI>18.5 && BMI<25.0){
        println("$BMI Normal Weight")
    }
    else if(BMI>25.0 &&BMI<30.0){
        println("$BMI Overweight")
    }
    else if(BMI>30.0){
        println("$BMI Obessity")
    }
    else
    println("Invalid BMI")
}