package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "JP"

    for (nome in nomes){
        println(nome)
    }

    println(" ")

    nomes.sort()
    nomes.forEach { println(it) }

    println(" ")

    val noomes = arrayOf("Julieta", "Mark", "Odin")

    noomes.sort()
    noomes.forEach { println(it) }
}