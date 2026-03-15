fun main() {
    println("Escreva a seguir dois números")
    val n1 = readln().toFloat()
    val n2 = readln().toFloat()

    if (n1 > n2) {
        println("O número " + n1 + " é maior que " + n2)
    } else {
        println("O número " + n2 + " é maior que " + n1)
    }

    if (n1 > 0 && n2 > 0) {
        println("Ambos os números são positivos!")
    } else if (n2 < 0 && n1 < 0) {
        println("Ambos os números são negativos!")
    } else println("1 positivo e 1 negativo.")


}

/*
1. Escreva um programa em que o usuário informe dois números.
 Então escreva em tela o maior deles.

2. Faça um programa que leia um valor informado pelo usuário
e diga se o valor informado é positivo, negativo ou zero.
 */