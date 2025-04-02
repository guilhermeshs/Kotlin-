package TIPOS_TIPAGEM

class No(val valor: Int, val proximo: No? = null)
//O ? no No? significa que a variável pode ser nula.
//= null → Indica que, por padrão, proximo será null caso não seja especificado.

fun main() {
    val no3 = No(3)
    val no2 = No(2, no3)
    val no1 = No(1, no2)

    println(no1.valor) // 1
    println(no1.proximo?.valor) // 2
    println(no1.proximo?.proximo?.valor) // 3

    //1 -> 2 -> 3 -> null

}
