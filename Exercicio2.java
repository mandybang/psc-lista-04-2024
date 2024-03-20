/**Faça um programa que leia um nome de usuário e a sua senha e não aceite a 
* senha igual ao nome do usuário, mostrando uma mensagem de erro e 
* voltando a pedir as informações
*/


import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char nomeUs;
        char senha;

        System.out.println("Digite um nome de usuario: "); 
        nomeUs = input.nextLine().charAt(0);

        System.out.println("Digite uma senha: ");
        senha = input.nextLine().charAt(0);


        while (nomeUs == senha) {
            System.out.println("Crie uma senha diferente do seu usuário: ");
            senha = input.nextLine().charAt(0);            
        }
            System.out.println("Usuario e senha criados com sucesso.");
            
        input.close();
    }
    
} 



