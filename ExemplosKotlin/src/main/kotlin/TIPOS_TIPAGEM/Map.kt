package TIPOS_TIPAGEM
fun main() {
    val mapa = mapOf("nome" to "Carlos", "idade" to "20")

    println("Mapa completo: $mapa")
    println("Valor da chave1: ${mapa["nome"]}") // Acessando um valor pela chave

    val mutavel = mutableMapOf(1 to "um", 2 to "dois")
    mutavel[3] = "três" // Adicionando um novo par chave-valor

    println("Mapa mutável: $mutavel")

    val Mapa = mutableMapOf("A" to 1, "B" to 2, "C" to 3)

    println(Mapa.keys)   // [A, B, C]
    println(Mapa.values) // [1, 2, 3]
    println(Mapa.entries) // [A=1, B=2, C=3] retorna pares chave-valor

    Mapa.putIfAbsent("D", 4) // Adiciona "D" apenas se não existir
    println(Mapa) // {A=1, B=2, C=3, D=4}
}
