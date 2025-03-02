package Core.NumberPrograms;

public class Factorial {

    public static void main(String[] args) {
        int num = -10, factorial = 1;
        if (num < 0) {
            System.out.println("Factorial of negative number is not possible");
        } else {
            while (num > 0) {
                factorial = factorial * num;
                num--;
            }
            System.out.println(factorial);
        }
    }
}
