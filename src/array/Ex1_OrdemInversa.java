package array;

/*
Crie um vetor de 6 números inteiros
e mostre-os na forma inversa.
 */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {0, -5, 12, 21, 34, 65};
        System.out.println("Vetor original: ");
        int count = 0;

        while (count <= (vetor.length - 1)) {
            System.out.println(vetor[count] + " ");
            count++;
        }
        System.out.println("Vetor Invertido: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
}
