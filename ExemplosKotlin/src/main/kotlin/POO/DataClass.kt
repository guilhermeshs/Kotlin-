package POO

/**
 * A classe Livro representa um livro com suas principais características.
 *
 * Como é uma data class, ela automaticamente gera métodos úteis, como
 * equals(), hashCode(), toString(), copy(), e componentN().
 */
data class Livro(
    val titulo: String,     // Título do livro
    val autor: String,      // Nome do autor
    val ano: Int,           // Ano de publicação
    val isbn: String        // Código ISBN do livro
)

fun main() {
    // Criando um objeto da classe Livro
    val livro1 = Livro(
        titulo = "O Senhor dos Anéis",
        autor = "J.R.R. Tolkien",
        ano = 1954,
        isbn = "978-0261103573"
    )

    // Exibindo o objeto Livro utilizando o métdo toString() automaticamente gerado
    println(livro1)

    // Usando o métdo copy() para criar uma nova instância com um atributo alterado
    val livro2 = livro1.copy(ano = 2001)

    // Exibindo o novo objeto com o ano alterado
    println(livro2)

}
