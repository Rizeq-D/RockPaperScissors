package com.rizeq.rockpaperscissors

fun main () {

    var computerChoice = ""
    var playerChoice = ""

    fun isValidChoice(choice : String): Boolean {

        return choice.equals("Rock", ignoreCase = true) ||
                choice.equals("Paper", ignoreCase = true) ||
                choice.equals("Scissors", ignoreCase = true)

    }

    do {
        println("Please enter what object you would like to choose: Rock, Paper, or Scissors")
        playerChoice = readln()
        if (!isValidChoice(playerChoice))
            println("Invalid input! Please enter Rock, Paper, or Scissors.")
    } while (!isValidChoice(playerChoice))

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissors"
    }

    val outcomes = mapOf(
        "Rock" to "Scissors",
        "Paper" to "Rock",
        "Scissors" to "Paper")

    val result = if (computerChoice.equals(playerChoice, ignoreCase = true)) {
        "It's a tie!"
    } else if (outcomes[computerChoice]!!.equals(playerChoice, ignoreCase = true)) {
        "The computer won! $computerChoice beats $playerChoice."
    } else {
        "You won! $playerChoice beats $computerChoice."
    }

    println("Computer choice: $computerChoice")
    println("Player choice: $playerChoice")
    println(result)

}