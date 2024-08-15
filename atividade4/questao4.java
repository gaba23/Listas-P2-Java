import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite o primeiro número:");
        numeros[0] = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        numeros[1] = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        numeros[2] = scanner.nextInt();

        System.out.println("Digite o quarto número:");
        numeros[3] = scanner.nextInt();

        System.out.println("Digite o quinto número:");
        numeros[4] = scanner.nextInt();

        dividir100(numeros);

        scanner.close();
    }

    public static void dividir100(int[] numeros) {
        for(int i = 0; i < 5; i++){
            double valor = numeros[i] / 100.0;
            System.out.println(valor);
        }
    }
}
