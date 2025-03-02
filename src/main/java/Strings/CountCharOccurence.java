package Strings;

public class CountCharOccurence {

    public static void main(String args[]){


        String str="automation123";//a=2 u=1 t=2 o=2 m=1 i=1 n=1
        /*char [] chrArr=str.toCharArray();
        int count=1;

        for(int i=0;i<chrArr.length;i++){
            for(int j=i+1;j<chrArr.length;j++){
                if(Character.toUpperCase(chrArr[i])==Character.toUpperCase(chrArr[j])){
                    System.out.println("is "+Character.toUpperCase(chrArr[i])+" == "+Character.toUpperCase(chrArr[j])+"?");
                    count++;
                }
            }
            System.out.println(Character.toUpperCase(chrArr[i]) + " occurs "+count+ " times...");
            count=1;
        /*String s = "automation";
        char[] ch = s.toCharArray();
        boolean[] b = new boolean[s.length()];

        System.out.println("Character Occurrences:");
        for (int i = 0; i < ch.length; i++) {
            if (b[i]) continue;     // Skip already counted characters
            int c = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    c++;
                    b[j] = true;     // Mark character as counted
                }
            }
            System.out.println(ch[i] + " : " + c);
        }*/
        int[] charCounts = new int[128];


        for (char ch : str.toCharArray()) {
            charCounts[ch]++;
        }

        for (char ch = 0; ch < 128; ch++) {
            if (charCounts[ch] > 0) {
                System.out.println(ch + ": " + charCounts[ch]);
            }

    }
}}
