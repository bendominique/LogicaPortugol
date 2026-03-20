fun main() {
    println("Digite o primeiro número:")
    val n1 = readln().toInt()

    println("Digite o segundo número:")
    val n2 = readln().toInt()

    var soma = 0

    for (i in n1..n2) {
        soma += i
    }

    val media = soma / (n2 - n1 + 1)

    println("Média: $media")
}

/*
5 - Faça um algoritmo que calcule e escreva a média aritmética dos
 dois números inteiros informados pelo usuário e todos
 os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.
 */