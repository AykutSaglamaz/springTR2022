package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class lists05 {

    public static void main(String[] args) {

//please write a method which adds "*" to the all elements


        List<String> str  = new ArrayList<>();

        str.add("aa");
        str.add("bab");
        str.add("ab");
        str.add("ac");



        addingStarAtTheEndTwo(str);

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(8);
        list1.add(7);

        multiply(list1);
    }

    public static void addingStarAtTheEndTwo(List<String>list){
        for(int i=0; i<list.size();i++){
            list.set(i,list.get(i)+"* ");
        }
        System.out.println(list);


    }

    //please create a method which multiplies all the elements by itself
    //and then call it from the main method.

    public static void multiply(List<Integer>list){

        for(int i=0; i<list.size();i++){
            list.set(i,list.get(i)*list.get(i));
        }
        System.out.println(list);


    }
}
