package loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Número: ");
            num = scan.nextInt();
            soma = soma + num;
            if (num > maior) maior = num;
            ++count;

        } while (count < 5) ;

        System.out.println("Programa Encerrado, Número maior foi: " +maior);
        System.out.println("Programa Encerrado, A média dos números foi: " + (soma / 5));
    }
}
