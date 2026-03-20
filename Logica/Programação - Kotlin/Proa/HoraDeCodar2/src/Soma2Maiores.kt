fun main() {
    print("---- SOMA DOS 2 MAIORES ----\n")
    print("Escreva três números: ")
    val numeros = FloatArray(3 )  {readln().toFloat()}

    numeros.sort() //transforma os números escritos em uma sequência do menor para o maior
    val maiorNumero = numeros[2]
    val segundoMaior = numeros[1]
    val resultado = maiorNumero + segundoMaior
    print("A soma dos maiores é: " + resultado)

}