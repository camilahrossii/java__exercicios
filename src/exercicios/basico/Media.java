package exercicios.basico;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular a média das notas...");

        System.out.println("Insira a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Insira a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas informadas é: " + media);

        scanner.close();

    }
}
