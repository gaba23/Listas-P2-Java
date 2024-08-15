import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int numero = scanner.nextInt();

        parImpar(numero);

        scanner.close();
    }

    public static void parImpar(int numero) {
        if(numero % 2 == 0){
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }
}
