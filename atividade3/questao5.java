import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para checar se é primo ou não: ");
        int numero = scanner.nextInt();
        
        int quantidade = 0;
        for (int i = numero - 1; i > 1; i--){
            if (numero%i==0){
                quantidade++;
            }
        }

        if (quantidade == 0){
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        scanner.close();
    }
}
