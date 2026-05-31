package beecrowd;

import java.util.Scanner;

/*
1010 - Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada

O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um
valor com 2 casas decimais.

Saída

A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos
 e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */

public class CalculoSimples {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int codigoPeca1 = leitura.nextInt();
        int quantidadePeca1 = leitura.nextInt();
        double valorPeca1 = leitura.nextDouble();

        int codigoPeca2 = leitura.nextInt();
        int quantidadePeca2 = leitura.nextInt();
        double valorPeca2 = leitura.nextDouble();

        double valorTotal = quantidadePeca1 * valorPeca1 + quantidadePeca2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);




    }
}
