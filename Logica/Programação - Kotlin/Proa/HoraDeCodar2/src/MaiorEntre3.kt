fun main(){
    print("----- MAIOR ENTRE 3 -----\n")
    print("Escreva três números: \n")
    val numeros = FloatArray(3 )  {readln().toFloat()}
    val maiorEntre3 = numeros.maxOrNull()

    if(numeros[1] == numeros[0] || numeros[2] == numeros[1] || numeros[0] == numeros[2]){
        print("Não podem haver números repetidos!!")
    }else print("o maior número é: " + maiorEntre3 )

}







/*
3. Faça um programa para ler 3 valores
(considere que não serão informados valores iguais)
e escrever o maior deles.

4. Faça um programa que leia 3 valores informados pelo usuário
 (considere que não serão informados valores iguais)
  e escrever a soma dos 2 maiores.
 */