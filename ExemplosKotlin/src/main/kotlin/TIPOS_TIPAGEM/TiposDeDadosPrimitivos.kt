package TIPOS_TIPAGEM
fun main() {
    // Exemplos de dados primitivos em Kotlin
    val meuByte: Byte = 127                    // 8 bits, valor máximo de 127
    val meuShort: Short = 32000                // 16 bits
    val meuInt: Int = 2147483647              // 32 bits, valor máximo de 2^31 - 1
    val meuLong: Long = 9223372036854775807    // 64 bits, valor máximo de 2^63 - 1
    val meuFloat: Float = 3.14f                // 32 bits, precisão menor
    val meuDouble: Double = 3.141592653589793   // 64 bits, precisão maior
    val meuBoolean: Boolean = true
    val meuChar: Char = 'K'

    // Demonstração de diferença de precisão entre Float e Double:
    val floatPrecision: Float = 1.0f / 3.0f
    val doublePrecision: Double = 1.0 / 3.0
    println("Float precisão (1/3): $floatPrecision")
    println("Double precisão (1/3): $doublePrecision")
}
