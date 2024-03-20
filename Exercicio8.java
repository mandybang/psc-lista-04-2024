/**Faça um programa que leia 5 números e informe a soma e a média dos números.*/

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma;
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;

    System.out.println("Digite 5 números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        soma = num1 + num2 + num3 + num4 + num5;
        int media = soma / 5;

        System.out.println("A soma dos valores: " + soma + "\nE a média é: " + media);


        input.close();
    }
    
}
