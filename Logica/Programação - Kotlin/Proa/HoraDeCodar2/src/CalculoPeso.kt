fun main(){
    println("Escolha 1. Feminino ou 2. Masculino")
    val opcao = readln().toInt()

    when (opcao) {
        1 -> calculoFeminino()
        2 -> calculoMasculino()
        else -> print("Opção Inválida!")
    }
}


fun calculoMasculino(): Float {

    println("Digite a altura (em centímetros):")
    val altura = readln().toFloat()
    val peso = (72.7 * altura) - 58
    println("O peso ideal é: " + peso/1000 + "kg")
    return altura
}
fun calculoFeminino(): Float{

    println("Digite a altura (em centímetros):")
    val altura = readln().toFloat()
    val peso = (62.1 * altura) - 44.7
    println("O peso ideal é: " + peso/1000 + "kg")
    return altura
}







/*
10. Tendo como entrada a altura e o gênero designado ao nascer (codificado da seguinte forma:
 1: feminino - 2: masculino - ) de uma pessoa, construa um programa que calcule
  e imprima seu peso ideal, utilizando as seguintes fórmulas.
Fórmula para cálculo:
(72.7 * h) - 58
(62.1 * h) - 44.7
 */