import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro, 0 para encerrar: ");
        int numeroLido = scanner.nextInt();

        int quantidade = 0;

        while (numeroLido != 0){
            if (numeroLido > 0) {
                quantidade++;
            }
            System.out.print("Digite um número inteiro, 0 para encerrar: ");
            numeroLido = scanner.nextInt();
        }

        System.out.println("Quantidade de positivos: " + quantidade);

        scanner.close();
    }
}
