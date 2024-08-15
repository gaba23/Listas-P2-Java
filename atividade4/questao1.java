import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        qualMaior(numero1, numero2);

        scanner.close();
    }

    public static void qualMaior(int numero1, int numero2) {
        if(numero1 > numero2){
            System.out.println("O maior é: " + numero1);
        } else if(numero1 < numero2) {
            System.out.println("O maior é: " + numero2);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
