package p2.atividade1;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro de três números para a média: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo de três números para a média: ");
        int segundoNumero = scanner.nextInt();

        System.out.print("Digite o terceiro de três números para a soma: ");
        int terceiroNumero = scanner.nextInt();

        int soma = primeiroNumero + segundoNumero + terceiroNumero;
        
        double media = soma / 3.0;

        System.out.print("A média dos números é: " + media);

        scanner.close();
    }
}