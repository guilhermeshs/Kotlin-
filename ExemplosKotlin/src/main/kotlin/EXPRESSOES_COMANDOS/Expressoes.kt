package EXPRESSOES_COMANDOS

fun main() {
    // 1. Expressões Literais
    val numeroLiteral = 42       // Literal inteiro
    val textoLiteral = "Kotlin"  // Literal de string
    val booleanoLiteral = true   // Literal booleano

    // 2. Expressão Agregada (Lista)
    val listaNumeros = listOf(10, 20, 30, 40)

    // 3. Expressão de Acesso a Constantes e Variáveis
    val nome = "Maria"
    println("Nome: $nome")  // Acesso à variável

    // 4. Expressão de Chamadas de Função
    fun saudacao(): String {
        return "Olá, $nome!"
    }
    println(saudacao())  // Chamada da função

    // 5. Expressões Condicionais (if e when)
    val idade = 20
    val status = if (idade >= 18){
        "Maior de idade"
    } else {
        "Menor de idade"
    }
    println("Status: $status") // Usando if

    val cor = "vermelho"
    val significado = when (cor) {
        "vermelho" -> "Poder"
        "azul" -> "Tranquilidade"
        else -> "Cor desconhecida"
    }
    println("Significado da cor: $significado") // Usando when

    // 6. Expressões Iterativas (for e while)
    println("Lista de números:")
    for (num in listaNumeros) {  // Usando for
        println(num)
    }

    var contador = 3
    println("Contagem regressiva:")
    while (contador > 0) {  // Usando while
        println(contador)
        contador--
    }
}
