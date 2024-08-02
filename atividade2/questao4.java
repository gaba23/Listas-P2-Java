import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        if(primeiroNumero == segundoNumero){
            System.out.print("Multiplicação: " + (primeiroNumero * primeiroNumero));

        } else if(primeiroNumero > segundoNumero){
            System.out.print("Subtração: " + (primeiroNumero - segundoNumero));

        } else{
            System.out.print("Soma: " + (primeiroNumero + segundoNumero));

        }

        scanner.close();
    }
}