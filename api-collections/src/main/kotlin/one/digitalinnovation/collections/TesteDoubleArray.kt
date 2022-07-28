package one.digitalinnovation.collections

fun main() {

    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 1500.00
    salarios[2] = 3000.00

    salarios.forEach { println(it) }
    println(" ")

    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println(" ")
    val bonus = doubleArrayOf(1500.0, 1250.0, 4500.0)
    bonus.sort()
    bonus.forEach { println(it) }
}