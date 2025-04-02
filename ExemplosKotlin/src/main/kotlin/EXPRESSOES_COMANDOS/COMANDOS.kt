package EXPRESSOES_COMANDOS

fun main() {
    // 1. Comando Skip (não faz nada)
    // Em Kotlin, um comando vazio pode ser representado por um return ou continue

    fun exemploSkip() {
        println("Início da função")
        return // Sai da função imediatamente
        println("Isso nunca será executado")
    }

    // 2. Comandos de Atribuição
    var x = 10 // Atribuição simples
    var y = 20
    println("Valores iniciais: x = $x, y = $y")

    // 3. Atribuição Múltipla (simulando)
    x = y.also { y = x } // Troca de valores entre `x` e `y`
    println("Após troca: x = $x, y = $y")

    // 4. Atribuição Simultânea
    var a = 1
    var b = 2
    var c = 3
    a = b.also { b = c.also { c = a } } // Troca simultânea de valores
    println("Após troca simultânea: a = $a, b = $b, c = $c")

    // 5. Chamada de Procedimento (Função sem retorno)
    fun mostrarMensagem(mensagem: String) {
        println(mensagem)
    }
    mostrarMensagem("Isso é uma chamada de procedimento")

    // 6. Comando Sequencial (executado em ordem)
    println("Comando 1")
    println("Comando 2")
    println("Comando 3")

    // 7. Comando Colateral (alterando estado externo)
    var contador = 0
    fun incrementar() {
        contador++  // Modifica a variável externa (efeito colateral)
    }
    incrementar()
    println("Contador após incremento: $contador")

    // 8. Comando Condicional (if e when)
    val idade = 18
    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }

    when (idade) {
        18 -> println("Tem exatamente 18 anos")
        else -> println("Outra idade")
    }

    // 9. Comando Iterativo (for e while)
    println("Loop for:")
    for (i in 1..3) {
        println("Iteração $i")
    }

    var n = 3
    println("Loop while:")
    while (n > 0) {
        println("n = $n")
        n--
    }

    // 10. Expressão de Comando (efeitos colaterais)
    println("Valor de contador antes: ${contador++}") // Incrementa e imprime
    println("Valor de contador depois: $contador")

    // 11. Comando Bloco e Expressão Bloco
    val resultado = run {
        val soma = 5 + 5
        soma // Retorna o valor final do bloco
    }
    println("Resultado do bloco: $resultado")
}
