package Core.NumberPrograms;

import java.util.Arrays;

public class ReverseArrayElements {
    public static void main(String args[]) {
        int a[] = {10, 10, 10, 20, 20, 30, 40, 50, 60, 60, 60, 70, 80, 90, 100, 100, 100, 100};
        int b[]=new int[a.length];
        System.out.println("Printing Reverse Array a[]:");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
            b[a.length-1-i]=a[i];
        }
        System.out.println("\nPrinting Array b[]:");
        System.out.println(Arrays.toString(b));
    }
}
