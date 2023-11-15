package exercicios.intermediario;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100);
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar um número de 1 a 100...");

        while (!acertou) {
            System.out.println("Digite a sua tetativa:");
            int tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroAleatorio) {
                System.out.println("Errou! Tente um número maior...");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("Errou! Tente um número menor...");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                acertou = true;
            }
        }
        scanner.close();
    }

}
