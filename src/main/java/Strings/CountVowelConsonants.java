package Strings;

public class CountVowelConsonants {

    public static void main(String args[]){

        String str="Java Programming";
        String vowel="aeiou";
        int i = 0,vowels=0,consonants=0;

        char[] chrArr=str.toLowerCase().toCharArray();

        while(i<str.length()-1){
             if(vowel.indexOf(chrArr[i]) != -1){
                 vowels++;
             }else{
                 consonants++;
             }
             i++;
        }
        System.out.println("Vowels: "+vowels+" Consonants: "+consonants+" in String: "+String.valueOf(chrArr));
    }
}
