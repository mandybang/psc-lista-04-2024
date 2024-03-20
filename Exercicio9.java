/**Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50*/


public class Exercicio9 {
    public static void main(String[] args) {

        for (int a = 1; a <= 50; a++) { // Verificar se o número é ímpar

            if (a % 2 != 0) { // o modulo '%' verifica se cada número é ímpar
                System.out.println(a);
            }
        }
    }
}