fun main () {

    var getEmpty = list(listOf("anabel", "yvonne", "Anna", "anastacia", "grace"))
    println(getEmpty)
    var person = Person("Ann", 21)
    person.speak()

    var animal = Animal("Mammal", "Yuuuu")
    animal.makesound()



}



//Write a function that takes a list of strings as a parameter and returns a new list that contains only the strings that start with te letter "a"
fun list(names:List<String>):List<String>{
    var emptyList= listOf<String>(" ")
    for (name in names){
        if(name[0]=='a'){
             emptyList+=name
        }
    }
    return emptyList
}

////    Create a class called Person with properties for name and age.
////    Write a method called speak that prints
////    "Hello, my name is {name} and I am {age} years old."

class Person(var name:String, var age:Int) {
    fun speak() {
        println("Hello, my name is ${name} and I am ${age} years old.")
    }
}
//Create a class called Animal with properties for species and sound.
//// Write a method called makeSound that prints "{species} says {sound}.

open class Animal(var species:String, var sound:String){
    open  fun makesound(){
        println("$species says $sound")
    }
}
////Write a program that asks the user to enter two numbers and stores them in variables.
//// The program should then calculate and print the sum, difference, product, and
//// quotient of the two numbers.
fun numbers(num1:Double,num2:Double):Double{
    var sum = num1+num2
    println(sum)
    var diff = num1-num2
    println(diff)
    var product = num1*num2
    println(product)
    var quotient = num1/num2

    return quotient

}
