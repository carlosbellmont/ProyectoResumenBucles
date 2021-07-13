fun main() {
    functionRepeat()
    functionRepeatCustom()
    functionWhile()
    functionDoWhile()
    functionForRange()
}



fun functionRepeat() {
    repeat(10) {
        println("Repeat escribe: $it")
    }
}

fun functionRepeatCustom() {
    repeat(10) { number ->
        println("RepeatCustom escribe: $number")
    }
}

fun functionWhile() {
    var i = 0
    while (i < 10) {
        println("functionWhile escribe: $i")
        i++
    }
}

fun functionDoWhile() {
    var i = 0
    do {
        println("functionDoWhile escribe: $i")
        i++
    } while (i < 10)
}

fun functionForRange() {
    for (i in 0..9) {
        println("functionForRange escribe: $i")
    }
}