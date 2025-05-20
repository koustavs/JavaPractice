package Core.NumberPrograms;

public class SecondLargestNumberInArray {
    public static void main(String[] args) throws java.lang.Exception {
        int[] a = {-2, 10, 20, 30, 40, 50, -50, -60, 70, 80, 90, 100, -1};
        int max = a[0];
        int min = a[0];
        int secondMax = a[0];
        int secondMin = 0;

        for (int i = 0; i <= a.length - 1; i++) {

            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Max : " + max + " Min : " + min);

        for (int i = 0; i <= a.length - 1; i++) {

            if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i];
            } else if (a[i] < secondMin && a[i] != min) {
                secondMin = a[i];
            }
        }

        System.out.println("secondMax : " + secondMax + " secondMin : " + secondMin);

    }
}
