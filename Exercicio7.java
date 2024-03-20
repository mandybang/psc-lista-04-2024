/**Faça um programa que leia 5 números e informe o maior número.*/

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int numMaior;
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

            numMaior = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5)))); 
        //Math.max() aceita apenas dois argumentos, neste caso ele é usado de forma aninhada para comparar cada número com o anterior

        System.out.println("O maior número é: " + numMaior);
        
        input.close();
    }
}