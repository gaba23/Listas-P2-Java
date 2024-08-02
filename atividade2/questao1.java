import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        if(primeiroNumero > segundoNumero){
            System.out.print("O maior número é: " + primeiroNumero);

        } else if(primeiroNumero < segundoNumero){
            System.out.print("O maior número é: " + segundoNumero);

        } else{
            System.out.print("Os números são iguais.");

        }

        scanner.close();
    }
}
