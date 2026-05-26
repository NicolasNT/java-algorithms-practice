package array;

/*
        Exercicio: Somar elementos de um array

        Objetivo:
         - Recebe um array de numeros
         - Soma todos os valores
         - Imprime o resultado

        Conceitos Praticados:
         - Arrays
         - Loops
         - Variable
         - Accumulation
        */

public class SumArray {
    public static void main(String[] args) {

        //Criando um array com numeros
        int[] numbers = {5, 10, 15, 20, 25};

        //Criando uma variavel para armazenar a soma
        int sum = 0;

        //Percorrendo o array
        for (int number : numbers) {
            sum += number;
        }

        //Exibindo resultado final
        System.out.println("Total da soma: " + sum);

    }
}
