package beecrowd;

/*
1007 - Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B
pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada

O arquivo de entrada contém 4 valores inteiros.

Saída

Imprima a mensagem DIFERENCA com todas as letras maiúsculas.
*/

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        int d = read.nextInt();

        int diferenca = a*b - c*d;

        System.out.println("DIFERENCA = " + diferenca);

    }
}
