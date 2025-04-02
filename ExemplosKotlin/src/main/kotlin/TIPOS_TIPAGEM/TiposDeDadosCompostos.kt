package TIPOS_TIPAGEM
fun main() {

    // Uma sequência de caracteres
    val myString: String = "Hello, Kotlin!"

    // Um vetor de elementos do mesmo tipo (produto cartesiano de índices inteiros e valores).
    val myArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    // Uma sequência ordenada de elementos, onde a ordem é preservada (produto cartesiano de índices e valores).
    val myList: List<String> = listOf("Kotlin", "Java", "Python")

    // Permite modificações (adição, remoção e alteração de elementos).
    val myMutableList: MutableList<String> = mutableListOf("A", "B", "C")

    // Uma coleção de elementos únicos sem ordem específica, união disjunta se comparado com outro conjunto).
    val mySet: Set<Int> = setOf(10, 20, 30, 10) // O valor 10 duplicado será ignorado.

    // Permite modificações (adição e remoção de elementos).
    val myMutableSet: MutableSet<Int> = mutableSetOf(10, 20, 30)

    // Um mapeamento de chaves únicas para valores.
    val myMap: Map<String, Int> = mapOf("One" to 1, "Two" to 2, "Three" to 3)

    // Permite modificações (adição, remoção e alteração de valores associados às chaves).
    val myMutableMap: MutableMap<String, Int> = mutableMapOf("A" to 100, "B" to 200)

    // Produto cartesiano de dois elementos.
    val myPair: Pair<String, Int> = Pair("Age", 30)

    // Produto cartesiano de três elementos.
    val myTriple: Triple<String, String, Int> = Triple("John", "Doe", 25)
}
