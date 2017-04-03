package com.equalinformation.scala.programs.collection.java.companion;

import java.util.Arrays;

/**
 * Created by bpupadhyaya on 4/2/17.
 * Author for Quick sort portion: John R. Hubbard, PhD
 */
public class QuickSort {
    public static void main(String...args) {
        int[] a = {3,4,2,1,9,8,7,5,90};
        int[] b ={-3,-8,7,9,20,1};
        int[] c ={9,3,2,1,6,-2,5};

        sort(a);
        sort(b);

        System.out.println("a sorted: ");
        for(int i: a) {
            System.out.print(i+", ");
        }

        System.out.println();
        System.out.println("b sorted: ");
        for(int j: b) {
            System.out.print(j+", ");
        }

        Arrays.sort(c);

        System.out.println();
        System.out.println("c sorted by Java library: ");
        for(int j: c) {
            System.out.print(j+", ");
        }


    }


    public static void sort(int[] a) {
        // Postcondition: a[0] <= a[1] <= ... <= a[a.length -1]
        sort(a, 0, a.length);
    }

    private static void sort(int[] a, int p, int q) {
        // Precondition: 0 <= p <= q <= a.length
        // Postcondition: a[p..q] is sorted;

        if(q-p < 2) {
            return;
        }

        int m = partition(a,p,q);
        sort(a, p, m);
        sort(a, m+1,q);
    }

    private static int partition(int[] a, int p, int q){
        // Returns: index m of pivot element a[m];
        // Postcondition: a[i] <= a[m] <= a[j] for p<= i <= m <=j <q;
        int pivot = a[p], i = p, j = q;
        while(i < j) {
            while(i < j && a[--j] >= pivot);
            if(i < j) {
                a[i] = a[j];
            }
            while(i < j && a[++i] <= pivot);
            if(i < j) {
                a[j] = a[i];
            }
        }
        a[j] = pivot;

        return j;
    }
}
