package loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro,
fornecido pelo usuário como entrada.
Sua saída deve ser como no exemplo abaixo.

5! = 120
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro para calcular seu fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicador = 1;

        for (int i = fatorial ;i >= 1 ;i-- ) {

            multiplicador = multiplicador * i;
        }
        System.out.println(fatorial + "!" + " = " + multiplicador);
    }
}
