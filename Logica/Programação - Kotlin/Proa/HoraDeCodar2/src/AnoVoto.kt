fun main(){
    println("Digite o ano em que você nasceu: ")
    val anoNascimento = readln().toInt()

    if(anoNascimento > 2008){
        println("\nVocê não poderá votar esse ano!")
    }else println("\nVocê pode votar esse ano!")
}

/*
. Escreva um programa para ler o ano de nascimento de uma pessoa e
 escrever uma mensagem que diga se ela poderá ou não votar este ano
  (não é necessário considerar o mês em que ela nasceu).
 */