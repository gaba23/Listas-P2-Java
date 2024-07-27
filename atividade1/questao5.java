package p2.atividade1;

import java.util.Scanner;
import java.lang.Math;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero1 = 0;
        int numero2 = 0;
        
        while (numero1 <= 0) {
            System.out.print("Insira o primeiro número: ");
            numero1 = scanner.nextInt();
            if (numero1 <= 0) {
                System.out.println("Por favor, insira um número maior que zero.");
            }
        }
        
        while (numero2 <= 0) {
            System.out.print("Insira o segundo número: ");
            numero2 = scanner.nextInt();
            if (numero2 <= 0) {
                System.out.println("Por favor, insira um número maior que zero.");
            }
        }
        
        double resultado = Math.pow(numero1, numero2);
        
        System.out.println("O resultado: " + resultado);
        
        scanner.close();
    }
}