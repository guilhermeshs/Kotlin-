package POO

class Pessoa(val nome: String, val idade: Int) { // Construtor primário

    var profissao: String = "Desconhecida"

    // Construtor secundário mais parecido com Java
    constructor(nome: String, idade: Int, profissao: String) : this(nome, idade) {
        this.profissao = profissao
    }

    fun exibirInformacoes() {
        println("Nome: $nome")
        println("Idade: $idade")
        println("Profissão: $profissao")
    }
}

fun main() {
    val pessoa1 = Pessoa("Alice", 30)  // Usando o construtor primário
    pessoa1.exibirInformacoes()

    val pessoa2 = Pessoa("Bob", 25, "Engenheiro")  // Usando o construtor secundário
    pessoa2.exibirInformacoes()
}
