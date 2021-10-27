fun main(args: Array<String>) {

    /*
    For

    1 - Faça um programa que leia um valor e imprima sua
    tabuada (aceite apenas números entre 1 e 10). Imprima, logo em seguida, a tabuada ao contrário
     */

      var opcao = "Sim"

    while(opcao == "Sim"){

        print("Digite um valor para calcularmos sua tabuada: ")
        var num = readLine()!!.toInt()

        for(i in 1..10){

            println("$num X $i = ${num * i}")

        }

        print("Você quer continuar?")
        opcao = readLine()!!

}




















}






