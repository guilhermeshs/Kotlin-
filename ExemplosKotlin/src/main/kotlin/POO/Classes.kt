package POO

abstract class FiguraGeometrica {
    abstract fun calcularArea(): Double
    abstract fun calcularPerimetro(): Double

    fun exibirInformacoes(nome: String) {
        println("Figura: $nome")
        println("Área: ${calcularArea()}")
        println("Perímetro: ${calcularPerimetro()}")
    }
}

class Quadrado(private val lado: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double {
        return lado * lado
    }

    override fun calcularPerimetro(): Double {
        return 4 * lado
    }
}

fun main() {
    val quadrado = Quadrado(5.0)
    quadrado.exibirInformacoes("Quadrado")
}