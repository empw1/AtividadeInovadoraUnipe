package ExerciciosAula;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a, b, soma, sub, mult, div;


        System.out.println("Digite o primeiro número: ");
        a = teclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        b = teclado.nextDouble();

        soma = a + b;
        sub = a - b;
        mult = a * b;
        div = a / b;

        System.out.println("A soma dos resultados digitados é: " + soma);
        System.out.println("A subtração dos resultados digitados é: " + sub);
        System.out.println("A multiplicação dos resutlados digitados é: " + mult);
        System.out.println("A divisão dos resultados digitados é: " + div);
    }
}
