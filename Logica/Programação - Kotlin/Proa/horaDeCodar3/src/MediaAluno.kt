data class Aluno(val nomeAluno : String, val mediaAluno : Float) //data classes servem para armazenarem dados, funcionam como um database embutido
val salvarAlunos = mutableListOf<Aluno>()

fun main(){
    var menuAtivo = true

    while(menuAtivo){
        println("Deseja cadastrar um aluno? \n1.Sim 2.Não")
        val opcaoUsuario = readln().toInt()

        if(opcaoUsuario == 1){
            cadastroDeAlunos()
        }else { menuAtivo = false }
    }
    println(salvarAlunos)
}

fun cadastroDeAlunos(){
    println(" ==== SISTEMA DA E.M.E.F MENINOS DA MUNA ==== ")

    println("Nome do aluno: ")
    val nomeAluno = readln().toString()
    var notaAluno = 0
    for(i in 1..2){
        println("Nota do aluno: ")
        notaAluno += readln().toInt()
    }


    var mediaFinal = notaAluno / 2




}

/*

6 - Escreva um programa para ler 2 notas de um aluno,
 calcular e imprimir a média final.
Considere que a nota de aprovação é 9,5.
Logo após escrever a mensagem "Calcular
a média de outro aluno Sim/Não?"
 e solicitar um resposta.
Se a resposta for "S"
, o programa deve ser
 executado novamente,
caso contrário deve ser
 encerrado exibindo a quantidade
 de alunos aprovados.

 */