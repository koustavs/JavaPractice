package Strings;

public class ReverseOnlyCharactersNotNumbers {
    public static void main(String[] args) {
//        Original String: 						 abc123def456xyz789
//        String after character-only reversal:  zyx123fed456cba789
        String str="abc123def456xyz789";
        System.out.println("Original String: \t\t\t\t\t\t"+str);
        char [] chrArr=str.toCharArray();

        int left=0;
        int right=chrArr.length-1;

        while(left<right){
            if(Character.isDigit(chrArr[left])){  //Add ! to reverse numbers, not characters!
                left++;
            }else if(Character.isDigit(chrArr[right])){  //Add ! to reverse numbers, not characters!
                right--;
            }else{
                char temp=chrArr[left];
                chrArr[left]=chrArr[right];
                chrArr[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println("String after character-only reversal: \t"+String.valueOf(chrArr));
    }
}
