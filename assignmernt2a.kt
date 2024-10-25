fun main(){
    val marks: Int=100
    if (marks<50){
    //println("You scored && marks")
    println("$marks Fail")}
    else if (marks>=50 && marks<60){
    //println("You scored && marks")
    println("$marks Pass")}
    else if(marks>=60 && marks<70){
        println("$marks Credit")}
    else if(marks>=70 && marks<90){
        println("$marks Distinction")}
    else if(marks>=90 && marks<100){
        println("$marks High Distinction")}
    else
        println("Invalid grade")
    }