fun main(){
    println("===========================================================================")
    println("                   A CALCULADORA DO KOTLIN")
    println("===========================================================================")
    println("Escolha um número de 1 a 4: \n1- Adição\n2-Subtração\n3-Divisão\n4-Multiplicação\n")

    val opcao = readln().toInt()


    when (opcao){
        1 -> adicao()
        2 -> subtracao()
        3 -> divisao()
        4 -> multiplicacao()
        else -> println("Opção Inválida! Tente novamente.")
    }

}
//é necessário determinar qual é o tipo da sua função, aqui eu estou passando Float.
//explicitando assim que é uma função de números decimas 32bits.
fun adicao(): Float {

    println("Você escolheu SOMA!")
    println("Digite dois números: ")
    val primeiro = lerNumeros()
    val segundo = lerNumeros()

    val resultado = primeiro + segundo
    println("O resultado é: " + resultado)
    return resultado

}

fun subtracao(): Float {

    println("Você escolheu SOMA!")
    println("Digite dois números: ")
    val primeiro = lerNumeros()
    val segundo = lerNumeros()

    val resultado = primeiro - segundo
    println("O resultado é: " + resultado)
    return resultado

}fun divisao(): Float {

    println("Você escolheu DIVISÃO!")
    println("Digite dois números: ")
    val primeiro = lerNumeros()
    val segundo = lerNumeros()

    val resultado = primeiro / segundo
    println("O resultado é: " + resultado)
    return resultado

}fun multiplicacao(): Float {

    println("Você escolheu MULTIPLICAÇÃO!")
    println("Digite dois números: ")
    val primeiro = lerNumeros()
    val segundo = lerNumeros()

    val resultado = primeiro * segundo
    println("O resultado é: " + resultado)
    return resultado

}

fun lerNumeros(): Float {
    return  readln().toFloat()
}
/*
11. Uma micro calculadora
Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem executadas
 (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
O programa deve calcular e escrever o resultado
 dessa operação sobre os dois valores lidos.

Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4 para as operações
 */