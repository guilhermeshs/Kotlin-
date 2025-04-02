package TIPOS_TIPAGEM
fun main() {

    //Kotlin: Fortemente Tipada & Estática

    var meuInt: Int = 10
    val numeroInt = 20

    /*
    meuInt é declarado explicitamente como Int,
    numeroInt tem seu tipo inferido como Int pelo compilador.
    */

    //meuInt = "texto" -> Type mismatch: inferred type is String but Int was expected
    meuInt = 20

    println(meuInt::class)
    println(numeroInt::class)

    //val meuDouble: Double = meuInt -> Type mismatch: inferred type is Int but Double was expected
    val meuDouble: Double = meuInt.toDouble()
    println(meuDouble::class)

    /*
    Ao chamar meuInt.toDouble(), você converte explicitamente o
    valor de Int para Double, o que deixa claro para o compilador
    que a conversão é intencional e segura.
    */


}