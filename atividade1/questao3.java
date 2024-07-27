package p2.atividade1;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite o salário atual: ");
        double primeiroNumero = scanner.nextInt();

        double salario = primeiroNumero * 1.25;

        System.out.print("O novo salario é: " + salario);

        scanner.close();
    }
}