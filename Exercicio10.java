/**Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1;
        int num2;

        System.out.print("Digite o primeiro número inteiro: ");
         num1 = input.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
         num2 = input.nextInt();
        
        int menor = Math.min(num1, num2); 
        int maior = Math.max(num1, num2);
        // Verifica qual número é menor e qual é maior para saber o periodo entre eles
        
        System.out.println("Números no intervalo entre " + menor + " e " + maior + ":");
        for (int a = menor + 1; a < maior; a++) {
            System.out.println(a);
        }
        
        input.close();
    } 
}
