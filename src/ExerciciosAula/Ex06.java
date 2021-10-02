package ExerciciosAula;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c, d, e, resolucao, menor;

        System.out.println("Digite o primeiro número: ");
        a = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        b = teclado.nextInt();

        System.out.println("O maior número é: " + (a>b?a:b));

        System.out.println("Digite o primeiro número: ");
        c = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        d = teclado.nextInt();
        System.out.println("Digite o terceiro número: ");
        e = teclado.nextInt();

        resolucao = (c<d?c:d);
        menor = resolucao<e?resolucao:e;

        System.out.println("O menor número é: " + menor);
    }
}
