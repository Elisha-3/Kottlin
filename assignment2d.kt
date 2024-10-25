fun main(){
    val age: Int=30
    if(age>=0 && age<13){
        println("Child")
    }
    else if(age>=13 && age<=19){
        println("Teenager")
    }
    else if(age>19 && age<=35){
        println("Young Adult")
    }
    else if(age>35 && age<=55){
        println("Adult")
    }
    else if(age>55){
        println("Senior")
    }
    else{
        println("Invalid Age")
    }
    
}