package array;

public class LargestNumber {
    public static void main(String[] args) {

        //Criando um array com numeros
        int[] numbers = {5, 8, 2, 20, 15};

        //Assumindo que o primeiro valor do array é o maior numero
        int largest = numbers[0];


        for (int i = 0; i < numbers.length; i++) {
            //Verificar se o numero atual é o maior encontrado
            if (numbers[i] > largest) {
                //Se for maior, atualiza o numero
                largest = numbers[i];
            }
        }

        System.out.println("The largest number is: " + largest);

    }
}
