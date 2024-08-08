import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero > segundoNumero) {
            for (int i = segundoNumero + 1; primeiroNumero > i; i++) {
                System.out.println(i);
            }
        } else if (primeiroNumero < segundoNumero) {
            for (int i = primeiroNumero + 1; segundoNumero > i; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Números iguais, não existem números entre os dois.");
        }

        scanner.close();
    }
}
