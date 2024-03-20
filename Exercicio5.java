/**Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. 
 * Valide a entrada e permita repetir a operação.*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int popA;
        int popB;
        int anos = 0; 
        double taxaCrescimentoA; 
        double taxaCrescimentoB; 

        System.out.print("Digite a quantidade da população do país A: ");
        popA = input.nextInt();
        input.nextLine();

        System.out.println("Digite a quantidade da população do país B: ");
        popB = input.nextInt();
        input.nextLine();

        System.out.println("Informe porcentagem da taxa de crescimento do país A: ");
        taxaCrescimentoA = input.nextDouble();
        input.nextLine();

        System.out.println("Informe porcentagem da taxa de crescimento do país B: ");
        taxaCrescimentoB = input.nextDouble();
        input.nextLine(); // explicação do uso no final do código



        while (popA < popB) {
            popA += popA * (taxaCrescimentoA / 100);
            popB += popB * (taxaCrescimentoB / 100);
            anos++; // incrementa os anos
        }

        System.out.println("População do país A: " + popA);
        System.out.println("População do país B: " + popB);
        System.out.println("O país A ultrapassou o país B após " + anos + " anos.");
        
        System.out.println("Deseja realizar novamente a operação? Digite sim ou não.");
        String retorno = input.nextLine();

        if (retorno.equalsIgnoreCase("sim")) { //equal é usado para verificar se a resposta é igual independente se ta maiusculo ou minusculo.
            main(args); // Chama o método main novamente para repetir a operação
            
        }
        else {
            System.out.println("Obrigado por utilizar o programa!");
        }

        input.close();
    }
}

/**Explicação:
 * Quando você usa input.nextInt() ou input.nextDouble() seguido de input.nextLine(), 
 * o nextLine() captura a nova linha pendente deixada pelo nextInt() ou nextDouble(). 
 * Portanto, quando você pede para o usuário digitar "sim" ou "não" para repetir a operação, 
 * ele não está esperando a entrada do usuário e pula direto para a próxima instrução. 
 * Por isso há necessidade de adicionar o input.nextLine(); após a solicitação de nextDouble ou nextInt*/