package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for(salario in salarios){
        println(salario)
    }

    println(" ")

    println("Maior salario: ${salarios.maxOf { salarios -> salarios }}")
    println("Menor salario: ${salarios.minOf { salarios -> salarios }}")
    println("Media salarial: ${salarios.average()}")

    println(" ")
     val salarioMaiorDe2500 = salarios.filter { it > 2500.0 }
    salarioMaiorDe2500.forEach{ println(it) }
}