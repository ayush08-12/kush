import java.io.*;
import java.util.Scanner;
import java.util.Random;

class MergeSort {
    static int max = 5000;

    void mergesort(int a[], int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            mergesort(a, low, mid);
            mergesort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    void merge(int a[], int low, int mid, int high) {
        int i, j, k, t[] = new int[max];
        i = low;
        j = mid + 1;
        k = low;
        t = new int[max];
        while ((i <= mid) && (j <= high)) {
            if (a[i] <= a[j])
                t[k++] = a[i++];
            else
                t[k++] = a[j++];
        }
        while (i <= mid)
            t[k++] = a[i++];
        while (j <= high)
            t[k++] = a[j++];
        for (i = low; i <= high; i++)
            a[i] = t[i];
    }

    public static void main(String args[]) {
        int i, n, a[];
        System.out.println("Enter the array size");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[max];

        Random generator = new Random();
        for (i = 0; i < n; i++)
            a[i] = generator.nextInt(20);
        System.out.println("Array before sorting");
        for (i = 0; i < n; i++)
            System.out.print(a[i] + "\t");
        long startTime = System.nanoTime();
        MergeSort m = new MergeSort();
        m.mergesort(a, 0, n - 1);
        long stopTime = System.nanoTime();
        long elapseTime = (stopTime - startTime);
        System.out.println();
        System.out.println("Sorted array is");
        for (i = 0; i < n; i++)
            System.out.print(a[i] + "\t");
        System.out.println();
        System.out.println("Time taken to sort array is:" + elapseTime + "nano seconds");
    }
}
