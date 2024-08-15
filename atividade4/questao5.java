import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Insira o dado da posição 1: ");
        numeros[0] = scanner.nextInt();

        System.out.println("Insira o dado da posição 2: ");
        numeros[1] = scanner.nextInt();

        System.out.println("Insira o dado da posição 3: ");
        numeros[2] = scanner.nextInt();

        System.out.println("Insira o dado da posição 4: ");
        numeros[3] = scanner.nextInt();

        System.out.println("Insira o dado da posição 5: ");
        numeros[4] = scanner.nextInt();

        System.out.println("Insira a chave de busca: ");
        int chave = scanner.nextInt();

        dividir100(numeros, chave);

        scanner.close();
    }

    public static void dividir100(int[] numeros, int chave) {
        boolean encontrado = false;
        int posicao = 0;

        for(int i = 0; i < 5; i++){
            if(chave == numeros[i]){
                encontrado = true;
                posicao = i + 1;
            }
        }

        if(encontrado) {
            System.out.println("Chave encontrada na posição: " + posicao);
        } else {
            System.out.println("Chave não encontrada!");
        }

    }
}
