package ExerciciosAula;

import java.util.Locale;
import java.util.Scanner;

public class Ex00 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double peso, altura;

        System.out.println("Qual seu peso? ");
        peso = teclado.nextDouble();
        System.out.println("Qual sua altura? ");
        altura = teclado.nextDouble();

        Locale.setDefault(Locale.US);

        System.out.printf("Peso: %.1f%n", peso);
        System.out.printf("Altura: %.2f%n", altura);

        teclado.close();
    }
}
