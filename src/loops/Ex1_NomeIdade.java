package loops;

import java.util.Scanner;

public class Ex1_NomeIdade {
    // Faça um programa que leia conjuntos de dois valores, o primeiro representando a matrícula do aluno
    // e o segundo representando a sua altura em centímetros. (Pare inserindo o valor 0 no campo nome)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = null;
        int idade = 0;

        while (nome != "0") {
            System.out.println("Digite seu nome ou zero(0) para sair:");
            nome = scan.next();
            System.out.println("Digite sua idade ou zero(0) para sair:");
            idade = scan.nextInt();
            break;

        }
        System.out.println("Bem vindo " +nome);
        System.out.println("Bem vindo " +idade);

    }
}
