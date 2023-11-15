package exercícios.intermediario;

public class Palindromo {

    public static void main(String[] args) {
        String palavra = "arara";

        boolean palindromo = true;

        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("A palavra " + palavra + " é um palíndromo.");
        } else {
            System.out.println("A palavra " + palavra + " não é um palíndromo.");
        }
    }

}
