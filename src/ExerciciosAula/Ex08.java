package ExerciciosAula;


import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double imc, altura, peso;

        System.out.println("Digite seu peso: ");
        peso = teclado.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = teclado.nextDouble();

        imc = peso / (altura*2);

        if (imc < 18.5){
            System.out.printf("Seu imc é: %.2f Você é Magro" , imc);
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.printf("Seu imc é: %.2f Você está com peso normal" , imc);
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.printf("Seu imc é: %.2f Você está com Sobrepeso" , imc);
        } else if (imc >= 30.0 && imc <= 34.9){
            System.out.printf("Seu imc é: %.2f Você está Obeso" , imc);
        } else{
            System.out.printf("Seu imc é: %.2f  Você está com Obesidade Mórbida" , imc);
        }



//        1 - O índice de massa corpórea (IMC) de um indivíduo é obtido dividindo-se o seu peso (em Kg) pelo quadrado da
//        altura (em metros). Assim, por exemplo, uma pessoa de 1,67m e pesando 55kg tem IMC igual a 19,73. Escreva um
//        programa que solicite ao usuário o seu peso em kg e sua altura em metros e, a partir deles, calcule o índice de
//        massa corpórea e apresente o resultado de acordo com a situação abaixo.
//        IMC Situação
//        < 18,5 Magro
//        18,5 – 24,9 Normal
//        25,0 – 29,9 Sobrepeso
//        30,0 – 34,9 Obeso
//        35,0 – 39,9 Obesidade mórbida
    }
}