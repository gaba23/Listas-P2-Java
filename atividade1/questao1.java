package p2.atividade1;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro de quatro números para a soma: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo de quatro números para a soma: ");
        int segundoNumero = scanner.nextInt();

        System.out.print("Digite o terceiro de quatro números para a soma: ");
        int terceiroNumero = scanner.nextInt();

        System.out.print("Digite o quarto de quatro números para a soma: ");
        int quartoNumero = scanner.nextInt();

        int soma = primeiroNumero + segundoNumero + terceiroNumero + quartoNumero;

        System.out.print("O resultado da soma é: " + soma);

        scanner.close();
    }
}
