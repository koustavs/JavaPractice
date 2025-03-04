package Core.NumberPrograms;

public class StaticBlock {

    static int stat = 10;
    static boolean flag = true;

    static {
        if (flag) {
            System.out.println("Static block is executed before main() ...");
        }
    }

    public static void main(String []args) {
        System.out.println("main() is executed after static block...");
        System.out.println("Value of static variable is: " + stat);
    }
}

