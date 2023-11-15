package exercicios.basico;

import java.util.Scanner;

public class ConversorDeGraus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("~~ CONVERSOR DE GRAUS ~~");
        System.out.println("Graus Celcius: ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (celcius * 9 / 5) + 32;

        System.out.println("Convertendo... " + celcius + "ºC é igual a " + fahrenheit + "ºF.");

        scanner.close();

    }
}
