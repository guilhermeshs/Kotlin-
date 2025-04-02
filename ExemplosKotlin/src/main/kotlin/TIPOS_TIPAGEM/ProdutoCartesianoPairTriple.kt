package TIPOS_TIPAGEM
fun main() {
    val par: Pair<Int, String> = Pair(1, "Um")
    val outroPar = 2 to "Dois"  // Forma alternativa de criar um Pair

    val triplo: Triple<Int, String, Double> = Triple(1, "Um", 2.5)

    println("Par: ${par.first}, ${par.second}")
    println("Outro Par: ${outroPar.first}, ${outroPar.second}")
    println("Triplo: ${triplo.first}, ${triplo.second}, ${triplo.third}")
    //Podemos acessar os elementos usando .first, .second e, no caso do Triple, .third.
}
