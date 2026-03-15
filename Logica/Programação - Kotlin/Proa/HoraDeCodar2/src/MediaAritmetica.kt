fun main() {
    var soma = 0.0
    val numerosLista = mutableListOf<Float>()
    val quantidadeNumeros = 6

    for(i in 1.. quantidadeNumeros){
        print("Escreva os números: ")
        val numeroDigitado = readln().toFloat()
        numerosLista.add(numeroDigitado)
        soma += numeroDigitado
    }
    print(numerosLista)
    val media = soma/6
    print(media)
}
/*
5.  Faça um programa que leia 6 valores informados pelo usuário,
calcule, exiba os números informados e escreva
a média aritmética desses valores lidos.


 */