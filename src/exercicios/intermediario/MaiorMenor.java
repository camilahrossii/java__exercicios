package exercicios.intermediario;

public class MaiorMenor {

    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            int numero = Integer.parseInt(System.console().readLine());

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}