import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int terceiroNumero = scanner.nextInt();

        if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero ){
            System.out.print("Condição Satisfeita");

        } else{
            System.out.print("Erro.");

        }

        scanner.close();
    }
}
