fun main(){
    //FOR LOOPS
//a FOR loop is a control flow statement that allows you to execute a block of code repeatedly
//it can be used as follows:
//1. Loop through a range e.g
for(i in 1..10){
println(i)}
for (i in 30..50){
println(i)}

//2. Loop through range in steps e.g
for(i in 1..10 step 2){
    println(i)
}
//3. Loop through a range in down steps
for(i in 100 downTo 0 step 5){
println(i)
}

//4. Loop through a list
val students = arrayOf("Peter", "Keanche", "Suzie", "Kelly","Banana", "Tonny","Mutinda")

for (student in students){
    println(student)
}
 val counties = arrayOf("Naiorbi", "Machakos", "Nyeri", "Kisumu", "Kisii", "Mombasa", "Kitui", "Garisa", "Kajiado", "Tana")
 for (county in counties){
    println(county)
 }
 val animals = arrayOf("Baboon", "Lion", "Monkey", "Elephant", "Cobras", "Ostrich")
 for(animal in animals){
    println(animal)
 }
 val items = arrayOf("Fruits", "Phones", "Bread", "Milk", "sugar", "utensils")
 for (item in items){
    println(item)
 }
 val months =arrayOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
 for (month in months){
    println(month)
 }
val books= arrayOf("Desire of Ages", "Steps to Christ", "Country living", "Eden Restored", "Sons and Daughters", "Happy Family")
for (book in books){
    println(book)
}
val ratings= arrayOf(4.0,2.6, 3.0, 3.9, 4.6, 5.0, 3.2)
for (i in ratings){
    println(i)
}
}