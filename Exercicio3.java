/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd'
*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        do {
            System.out.print("Digite seu nome: ");
            nome = input.nextLine();
        } while (nome.length() < 3); // .length é o método utilizado em Java para obter o tamanho (número de caracteres) de uma string.


        do {
            System.out.print("Digite sua idade : ");
            idade = input.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Digite seu salário: ");
            salario = input.nextDouble();
        } while (salario <= 0);


        do {
            System.out.print("Digite seu sexo, sendo F para Feminino e M para masculino: ");
            sexo = Character.toLowerCase(input.next().charAt(0)); 
            // character.toLowerCase é para converter para minuscula 
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.print("Digite seu estado civil \n Solteiro : S \n Casado: C \n Viuvo: V \n divorciado: D  ");
            estadoCivil = Character.toLowerCase(input.next().charAt(0));  
            // character.toLowerCase é para converter para minuscula 
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        // Exibição das informações
        System.out.println("\nInformações fornecidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        input.close();
    }
    
}
