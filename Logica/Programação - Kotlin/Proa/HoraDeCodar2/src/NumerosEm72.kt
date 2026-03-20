fun main(){
    var soma = 0.0
    val numerosLista = mutableListOf<Float>()
    val quantidadeNumeros = 6

    for(i in 1.. quantidadeNumeros){
        print("Escreva os números: ")
        val numeroDigitado = readln().toFloat()
        if(numeroDigitado < 72) {
            numerosLista.add(numeroDigitado)
            soma += numeroDigitado
        }else numerosLista.add(numeroDigitado)
    }
    println("Os números digitados foram: " + numerosLista)
    println("A soma dos números é: " + soma)

}

/*
7. Faça um programa que leia 6 números que o usuário vai informar.
 Todos os números lidos com valor inferior a 72 devem ser somados.
 Escreva o valor final da soma efetuada e também
  todos valores que o usuário informou.
 */