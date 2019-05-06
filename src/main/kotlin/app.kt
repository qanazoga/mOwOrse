package com.qanazoga

import java.awt.datatransfer.StringSelection
import java.awt.Toolkit

fun main(args: Array<String>) {
    val phrase: String = if (args.isEmpty()) {
        println("Hewwo!!! ouo")
        readLine()!!
    } else {
        args.joinToString(" ")
    }

    val converted = convertPhrase(phrase)
    val stringSelection = StringSelection(converted)
    val clipboard = Toolkit.getDefaultToolkit().systemClipboard
    clipboard.setContents(stringSelection, null)

    println("\nOTAY!!!\nI put dat in u cwipbowd >w<")
    if (args.isNotEmpty())  {
        println("pwess ENTER to cwose...")
        readLine()
    }
}

fun convertPhrase(str: String): String {
    var word = ""
    str.toLowerCase().forEach { word += convertLetter(it) }
    return word
}

fun convertLetter(c: Char): String {
    var letter = when (c) {
        ' ' -> "^w^ "
        'a' -> "owo uwu"
        'b' -> "uwu owo owo owo"
        'c' -> "uwu owo uwu owo"
        'd' -> "uwu owo owo"
        'e' -> "owo"
        'f' -> "owo owo uwu owo"
        'g' -> "uwu uwu owo"
        'h' -> "owo owo owo owo"
        'i' -> "owo owo"
        'j' -> "owo uwu uwu uwu"
        'k' -> "uwu owo uwu"
        'l' -> "owo uwu owo owo"
        'm' -> "uwu uwu"
        'n' -> "uwu owo"
        'o' -> "uwu uwu uwu"
        'p' -> "owo uwu uwu owo"
        'q' -> "uwu uwu owo uwu"
        'r' -> "owo uwu owo"
        's' -> "owo owo owo"
        't' -> "uwu"
        'u' -> "owo owo uwu"
        'v' -> "owo owo owo uwu"
        'w' -> "owo uwu uwu"
        'x' -> "uwu owo owo uwu"
        'y' -> "uwu owo uwu uwu"
        'z' -> "uwu uwu owo owo"
        else -> ""
    }
    if (letter.isNotBlank() && letter != "^w^ ") letter += " >w< "
    return letter
}