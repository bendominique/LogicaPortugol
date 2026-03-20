fun main(){
    var valor1 = readln().toFloat()
    var valor2 = readln().toFloat()

    while(valor2 <=0 ){
        print("Por gentileza, insira um valor maior que zero!\n")
        valor2 = readln().toFloat()
    }
    val divisao = valor1 / valor2
    println("O resultado da divisão é: " + divisao)
}


/*
2 - Escreva um algoritmo para ler 2 valores informados pelo usuário e enquanto o segundo valor
 informado for igual ou menor que ZERO, deve ser lido um novo valor, mas para a mesma variável.
  Ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo.
O seu programa deve imprimir o resultado da divisão do primeiro valor
lido pelo segundo valor e exibir o resultado ao usuário.
 */