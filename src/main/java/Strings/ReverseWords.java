package Strings;

public class ReverseWords {

    public static void main(String args[]) {

        String str = "This is reverse program";
        StringBuilder reversedStr = new StringBuilder();

        String[] strArr = str.split(" ");

        for (int i = strArr.length - 1; i >= 0; i--) {
            if (i == 0) {
                reversedStr.append(strArr[i]);
            } else {
                reversedStr.append(strArr[i]).append(" ");
            }
        }

        System.out.println(reversedStr.toString());

    }

}
