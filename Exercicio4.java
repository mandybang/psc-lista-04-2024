/** Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% 
e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, 
mantidas as taxas de crescimento
 */

public class Exercicio4 {
    public static void main(String[] args) {
        int popA = 80000;
        int popB = 200000;
        int anos = 0; 

        double taxaCrescimentoA = 3; 
        double taxaCrescimentoB = 1.5; 


        while (popA < popB) {
            popA += popA * (taxaCrescimentoA / 100);
            popB += popB * (taxaCrescimentoB / 100);
            anos++; // incrementa os anos
        }

        System.out.println("População do país A: " + popA);
        System.out.println("População do país B: " + popB);
        System.out.println("O país A ultrapassou o país B após " + anos + " anos.");
        
    }
}