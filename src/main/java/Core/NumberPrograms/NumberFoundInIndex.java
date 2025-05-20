package Core.NumberPrograms;

public class NumberFoundInIndex {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 10, 70, 80, 10, 100};

        int key = 10;
        boolean found = false;

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == key) {
                found = true;
                System.out.println(key + " found in index : " + i);
            }

        }
        if (!found) {
            System.out.println(key + " not found");
        }

    }
}
