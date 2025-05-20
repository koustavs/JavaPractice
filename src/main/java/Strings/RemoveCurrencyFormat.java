package Strings;

public class RemoveCurrencyFormat {

    public static void main(String args[]) {
        String str1 = "$123,456.78";
        String str2 = "$987,654.32";
        String str3 = "$1,234.56";
        String str4 = "$9,876.54";
        System.out.println("Str1 : "+str1.replace("$","").replace(".","").replace(",",""));
        System.out.println("Str2 : "+str2.replaceAll("\\D",""));
        System.out.println("Str3 : "+str3.replaceAll("[^0-9]",""));
        System.out.print("Str4 : ");
        char[] chrArr = str4.toCharArray();
        for (int i = 0; i < chrArr.length; i++) {
            if (Character.isDigit(chrArr[i])) {
                System.out.print(chrArr[i]);
            }
        }
    }
}
