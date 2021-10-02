package ExerciciosAula;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double nota;

        System.out.println("Digite a nota do aluno: ");
        nota = teclado.nextDouble();

        if (nota >= 7.0){
            System.out.println("Passou por média!");
        }else if(nota >= 5.0 && nota < 7){
            System.out.println("Vai pra final!");
        }else
            System.out.println("Reprovou!");
    }
}
