package exercicios.intermediario;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para calcular o Fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial do número " + numero + " é " + fatorial);

        scanner.close();
    }

    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            return -1;
        }

        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

}
