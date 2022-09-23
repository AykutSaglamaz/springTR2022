package Practice1;

import java.util.*;

public class A16 {
    public static void main(String[] args) {
        Character arr []= new Character[4];
        arr[0]= 'a';
        arr[1]= 'b';
        arr[2]= 'c';
        arr[3]= 'd';
        System.out.println(Arrays.toString(arr));//[a, b, c, d]
//1. yol
        List<Character> c = new ArrayList<>();

         for(int i =0; i<arr.length; i++){
            c.add(arr[i]) ;
         }

         c.add( 'f');
         c.remove(2);
         c.clear();

        System.out.println(c);//[a, b, c, d]

//2. yol Arrays.asList()

        List<Character> c1 = Arrays.asList(arr);

//        c1.add('g'); //UnsupportedOperationException
//        c1.remove(1); ///UnsupportedOperationException
//        c1.clear(); //UnsupportedOperationException
        System.out.println(c1);//[a, b, c, d]

        // List'i Array'e nasil cevrilir

        List<Integer> list4 = new ArrayList<>();

        list4.add(12);
        list4.add(1);
        list4.add(6);
        list4.add(32);
        System.out.println(list4);//[12, 1, 6, 32]
        Integer arr2[]= list4.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr2)); //[12, 1, 6, 32]

        // set() ==> elemani siler yerine isteginiz yeni elaman ekler => set() elemani gunceller
        list4.set(2, 8);

        System.out.println(list4);//[12, 1, 8, 32]

// List veya ArrayList'e bir eleman nasil guncellenir veya silinebilir

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Veli");
        list1.add("Bahar");
        list1.add("Kaan");
        list1.add("Leyla");
        list1.add("Onur");
        list1.add("Kaan");

        System.out.println(list1);//[Ali, Veli, Bahar, Kaan, Leyla, Onur]
        list1.remove(list1.indexOf("Kaan"));
        list1.set(list1.indexOf("Leyla"), "Mustafa");



        System.out.println(list1);

    }

}
