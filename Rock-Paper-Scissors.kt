package com.example.kotlinbasics

fun main(){
    var ComputerChoice =" "
    var Playerchoice = " "
    while (Playerchoice !in listOf("Rock", "Paper", "Scissors")) {
        println("ENTER YOUR CHOICE (Rock/Paper/Scissors): ")
        Playerchoice = readLine() ?:" "
    }

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
