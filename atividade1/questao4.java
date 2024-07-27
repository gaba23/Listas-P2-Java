package p2.atividade1;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da base do triangulo: ");
        int base = scanner.nextInt();

        System.out.print("Digite o valor da altura do triangulo: ");
        int altura = scanner.nextInt();

        double area = (base * altura) / 2.0;

        System.out.print("O valor da area é: " + area);

        scanner.close();
    }
}