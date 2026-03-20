fun main(){
    println("Digite 4 números")
    val nota = mutableListOf<Float>()
    var soma = 0.0

    while(nota.size < 4){
        val notaDigitada = readln().toFloat()
        if(notaDigitada == null || notaDigitada < 0 || notaDigitada > 10){
            print("Digite um número válido!")
        }else nota.add(notaDigitada)
        soma += notaDigitada
    }
    print("Suas notas foram: " + nota)
    val media = soma/4
    if(media > 5){
        println("\nParabéns! Você passou no teste!")
    }else println("\nTente novamente!")
}

/*
8. Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores que 0 e menores que 10.
 No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste".
  Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"
 */