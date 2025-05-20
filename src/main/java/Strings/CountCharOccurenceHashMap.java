package Strings;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CountCharOccurenceHashMap {

    public static void main(String args[]){


        String str="Automation";//{a=2, t=2, u=1, i=1, m=1, n=1, o=2}

        char[] chrArr=str.toLowerCase().toCharArray();

        HashMap<Character,Integer> charCountMap=new HashMap<Character,Integer>();

        for (char c:chrArr){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }
            else{
                charCountMap.put(c,1);
            }
        }

        System.out.println(charCountMap);

//        for (Map.Entry entry : charCountMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

}}
