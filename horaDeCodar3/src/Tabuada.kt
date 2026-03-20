fun main(){
    var numeroN = readln().toInt()
    var i = 0.toInt()

    for(numero in i..< numeroN){
        while(numeroN >=  i){
            print(""+ i+ " * "+ ""+ numeroN+ " = "+ numeroN*i+ "\n")
            i++
        }
    }
}