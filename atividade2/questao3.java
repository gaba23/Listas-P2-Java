import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número: ");
        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.print(numero + " é par");

        } else{
            System.out.print(numero + " é ímpar");

        }

        scanner.close();
    }
}
