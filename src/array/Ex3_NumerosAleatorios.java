package array;

import java.util.Random;

/*
Faça um programa que leia 20 números aleatórios ( 0 a 100) armazene-os num vetor,
Ao final mostre os números  e seus sucessores.
 */
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random mRandom = new Random();
        int[] mNumRandom = new int[20];

        for (int i = 0; i < mNumRandom.length; i++) {
            int mNum = mRandom.nextInt(100);
            mNumRandom[i] = mNum;
        }


        System.out.print("Números aleatórios: ");
        for (int num : mNumRandom) {
            System.out.println(num + " ");
        }

        System.out.print("\nNúmeros sucessores: ");
        for (int num : mNumRandom) {
            System.out.println((num + 1) + " ");
        }
    }
}
