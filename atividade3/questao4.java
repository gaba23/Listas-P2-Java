import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro e positivo: ");
        int menorNumero = scanner.nextInt();

        System.out.print("Digite um número inteiro e positivo, maior que o anterior: ");
        int maiorNumero = scanner.nextInt();

        for (int i = menorNumero; i <= maiorNumero; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
