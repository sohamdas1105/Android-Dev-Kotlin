package com.example.kotlinbasics
fun main(){

println("Enter the age ")
    var enteredvalue = readln()
    var age = enteredvalue.toInt()
    if(age>18){
        println("you are allowed")
    }
    else{
        println("not allowed")
    }
}

