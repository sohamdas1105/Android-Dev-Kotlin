package com.example.kotlinbasics
fun main() {
    println("enter the age as whole number")
    var enteredvalue = readln()
    var age = enteredvalue.toInt()
    if(age in 18..39){
        println("you can enter the club")
    }
    else if(age>=40){
        println("You are too old please go home")
    }
    else{
        println("Age not verified please contact support")
    }



}
