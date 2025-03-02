package Core.NumberPrograms;

public class PalindromeNumber {

    public static void main(String args[]){

        int num=15851;
        int numCopy=num;
        int rev=0,rem=0;

        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }

        if(numCopy==rev){
            System.out.println(numCopy+" is palindrome");
        }
        else{
            System.out.println(numCopy+" is not palindrome");
        }

    }

}
