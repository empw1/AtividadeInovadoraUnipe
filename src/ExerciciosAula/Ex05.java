package ExerciciosAula;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        //Faça um programa que receba 3 notas de aluno(em variaveis do tipo String, utilizando o metodo nextLine() ou next() e calcule sua média)
        Scanner teclado = new Scanner(System.in);

        String nota1, nota2, nota3;
        double n1, n2, n3, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = teclado.nextLine();
        n1 = Double.parseDouble(nota1);
        System.out.println("Digite a segunda nota: ");
        nota2 = teclado.nextLine();
        n2 = Double.parseDouble(nota2);
        System.out.println("Digite a terceira nota: ");
        nota3 = teclado.nextLine();
        n3 = Double.parseDouble(nota3);

        media = (n1 + n2 + n3) / 3;

        System.out.println("A média é: " + media);
    }
}
