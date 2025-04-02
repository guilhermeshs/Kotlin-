package TIPOS_TIPAGEM

sealed class Resultado
// Classe que restringe suas subclasses
class Sucesso(val dado: String) : Resultado()
class Erro(val mensagem: String) : Resultado()

fun processarResultado(resultado: Resultado) {
    when (resultado) {
        is Sucesso -> println("Sucesso: ${resultado.dado}")
        is Erro -> println("Erro: ${resultado.mensagem}")
    }
}

fun main() {
    val res1: Resultado = Sucesso("Operação concluída")
    val res2: Resultado = Erro("Falha na operação")

    processarResultado(res1)
    processarResultado(res2)
}
