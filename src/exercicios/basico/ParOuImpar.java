package exercicios.basico;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("~~ Par ou Ímpar? ~~");
        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR!");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR!");
        }

        scanner.close();

    }

}
