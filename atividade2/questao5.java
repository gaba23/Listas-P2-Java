import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 1 para somar \nDigite 2 para subtrair \nDigite 3 para multiplicar \nDigite 4 para dividir: ");
        int metodo = scanner.nextInt();
        
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        if(metodo == 1){
            System.out.println("Soma: " + (primeiroNumero + segundoNumero));
        } else if(metodo == 2){
            System.out.println("Subtração: " + (primeiroNumero - segundoNumero));
        } else if(metodo == 3) {
            System.out.println("Multiplicação: " + (primeiroNumero * segundoNumero));
        } else if(metodo == 4) {
            if (segundoNumero != 0) {
                double resultado = (double) primeiroNumero / segundoNumero;
                System.out.println("Divisão: " + resultado);
            } else {
                System.out.println("Erro: divisão por zero não é permitida.");
            }
        } else {
            System.out.println("Método inválido.");
        }

        scanner.close();
    }
}
