package ExerciciosAula;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, soma, subtrair;

        System.out.println("Digite o primeiro número: ");
        a = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        b = teclado.nextInt();

        soma = a + b;
        subtrair = a - b;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A subtração dos números é: " + subtrair);
    }
}
