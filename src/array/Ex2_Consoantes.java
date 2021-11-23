package array;

/*
Faça um programa que elai um vetor de 6 caracteres,
 e diga quantas consoantes foram lidas.
 Imprima as consoantes.
 */

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner mScan = new Scanner(System.in);

        String[] mConsoantes = new String[6];
        int mQuantConsoantes = 0;

        int mCount = 0;

        do {
            System.out.println("Digite uma letra: ");
            String mLetra = mScan.next();

            if (!(mLetra.equalsIgnoreCase("a") |
                    mLetra.equalsIgnoreCase("e") |
                    mLetra.equalsIgnoreCase("i") |
                    mLetra.equalsIgnoreCase("o") |
                    mLetra.equalsIgnoreCase("u"))) {

                mConsoantes[mCount] = mLetra;
                mQuantConsoantes++;
            }
            mCount++;

        }while (mCount < mConsoantes.length);

        System.out.println("Consoantes: ");

        for ( String mConsoante : mConsoantes ) {
            if (mConsoante != null) {
                System.out.println(mConsoante + " ");
            }
            System.out.println("Quantidade de Consoantes: " + mQuantConsoantes);
        }
    }
}
