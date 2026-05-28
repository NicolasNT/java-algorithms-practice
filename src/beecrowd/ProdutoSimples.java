package beecrowd;
import java.util.Scanner;

/*
1004 - Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua
esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.

Entrada

O arquivo de entrada contém 2 valores inteiros.

Saída

Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco
antes e depois da igualdade.
 */

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int a = read.nextInt();
        int b = read.nextInt();

        int prod = a * b;

        System.out.println("PROD = " + prod);

    }
}
