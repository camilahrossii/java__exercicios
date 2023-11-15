package exercícios.intermediario;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = somar(num1, num2);
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + soma);

        int subtracao = subtrair(num1, num2);
        System.out.println("A subtração de " + num1 + " e " + num2 + " é: " + subtracao);

        int multiplicacao = multiplicar(num1, num2);
        System.out.println("A multiplicação de " + num1 + " e " + num2 + " é: " + multiplicacao);

        int divisao = dividir(num1, num2);
        System.out.println("A divisão de " + num1 + " e " + num2 + " é: " + divisao);
    }

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }
}
