package Core.NumberPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SortingUsingTreeSet {

    public static void main(String args[]) {
        List <Integer> list = new ArrayList<>();

        list.add(111);
        list.add(11);
        list.add(1111);
        list.add(11);
        list.add(111111);
        list.add(1111111);
        list.add(111111);
        list.add(111);
        list.add(11);
        list.add(11111);

        System.out.println(list);

        TreeSet<Integer> treeSet = new TreeSet<>(list);

        System.out.println(treeSet);

        List <String> listStr = new ArrayList<>();

        listStr.add("Abc");
        listStr.add("def");
        listStr.add("xyz");
        listStr.add("stu");
        listStr.add("jkl");
        listStr.add("def");
        listStr.add("ghi");
        listStr.add("mno");
        listStr.add("def");
        listStr.add("fgh");

        System.out.println(listStr);

        TreeSet<String> treeSetStr = new TreeSet<>(listStr);

        System.out.println(treeSetStr);
    }

}
