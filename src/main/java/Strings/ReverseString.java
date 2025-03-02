package Strings;

public class ReverseString {

    public static void main(String args[]){
        String str1="Selenium";
        String str2="Koustav";
        String str3="Welcome";
        String str4="TeaPot";
        String rev1="";
        String rev2="";
        String rev3="";
        String rev4="";

        for (int i=str1.length()-1;i>=0;i--){
            rev1=rev1+str1.charAt(i);
        }
        System.out.println("Str1: "+rev1);

//        System.out.println("Str3: "+rev3);
//        System.out.println("Str4: "+rev4);

        char[] chrArr=str2.toCharArray();

        for(int j=chrArr.length-1;j>=0;j--){
            rev2=rev2+chrArr[j];
        }
        System.out.println("Str2: "+rev2);
    }

}
