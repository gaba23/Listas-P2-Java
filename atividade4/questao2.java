import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        System.out.println("Digite o primeiro número:");
        numeros[0] = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        numeros[1] = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        numeros[2] = scanner.nextInt();

        isFirstGreater(numeros);

        scanner.close();
    }

    public static void isFirstGreater(int[] numeros) {
        if(numeros[0] > numeros[1] && numeros[0] > numeros[2]){
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
    }
}
