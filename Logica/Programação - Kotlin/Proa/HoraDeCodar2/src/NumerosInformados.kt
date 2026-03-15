fun main(){
    println("Digite 4 números")
    val numeros = mutableListOf<Float>()

    while(numeros.size < 4){
        val numeroDigitado = readln().toFloat()
        if(numeroDigitado == null){
            print("Digite um número válido!")
        }else if(numeros.contains(numeroDigitado)){
            print("Esse número já foi digitado!")
        }else numeros.add(numeroDigitado)

}
    val primeiroNumero = numeros[0]
    val ultimoNumero = numeros[3]
    val maiorNumero = numeros.maxOrNull()

    print("\nO primeiro número é: " + primeiroNumero + ".\n O último número é: " + ultimoNumero + ".\n O maior número é: " + maiorNumero)
}

/*
6. Faça um programa que receba quatro valores informados pelo usuário,
 mas informe somente o primeiro, o último e o maior de todos eles
  (considere que todos os números informados serão diferentes)
 */