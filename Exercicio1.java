/** Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
mensagem caso o valor seja inválido e continue pedindo até que o usuário 
informe um valor válido. */


import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int nota;
        System.out.println("Digite um número de zero à dez: ");
        nota = input.nextInt();
        
        while (nota > 10) {
            System.out.println("Valor inválido, digite um valor solicitado.");
            nota = input.nextInt();
        }
        System.out.println("Número valido, obrigada.");
        input.close();
    }
}