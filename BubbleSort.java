/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int size, i, num;
        System.out.println("Enter a size of vector");
        size = in.nextInt();
        int vet[] = new int[size];
        System.out.println("Enter the" + size + " nubers in the vector:");
        for (i = 0; i < vet.length; i++) {
            vet[i] = in.nextInt();
        }
        bubbleSort(vet);
    }

    public static void bubbleSort(int vet[]) {
        int aux;
        for (int i = 0; i < vet.length; ++i) {
            for (int j = i; j < vet.length; ++j) {
                if (vet[i] > vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }

        for (int i = 0; i < vet.length; ++i) {
            System.out.println(vet[i] + " ");
        }
    }
}
