package parking

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var exit = false
    while (!exit) {
        print("What")
    }

    val string = scanner.nextLine().split(" ")
    if (string[0] == "park") {
        println(string[2] + " car parked on the spot 2.")
    } else if (string[0] == "leave") {
        if (string[1] == "1") {
            println("Spot 1 is free.")
        } else if (string[1] == "2") {
            println("There is no car in the spot 2.")
        }
    }

}

fun check(array: IntArray): Boolean {
    return true;
}

fun park(lot: Int) {

}
