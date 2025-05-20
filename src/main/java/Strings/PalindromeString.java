package Strings;

public class PalindromeString {

    public static void main(String args[]){
        String str="radar";
        String rev="";

        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        System.out.println("Reverse String : "+rev);

        if (str.equals(rev)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

    }

}
