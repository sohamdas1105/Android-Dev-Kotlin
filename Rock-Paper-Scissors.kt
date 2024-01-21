package com.example.kotlinbasics

fun main(){
    var ComputerChoice =" "
    var Playerchoice = " "
    println("ENTER YOUR CHOICE")
    Playerchoice = readln()
    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> {
            ComputerChoice = "Rock"
        }
        2 -> {
            ComputerChoice= "Paper"
        }
        3 -> {
            ComputerChoice = "Scissors"
        }
    }
    println(ComputerChoice)
    var winner = when{
        Playerchoice == ComputerChoice ->"Tie"
        Playerchoice == "Rock" && ComputerChoice == "Paper" -> "Computer Wins"
        Playerchoice == "Paper" && ComputerChoice == "Scissors" -> "Computer Wins"
        Playerchoice == "Scissors" && ComputerChoice == "Rock" -> "Computer Wins"
        else -> "Player Wins"
    }
    println(winner)
}
