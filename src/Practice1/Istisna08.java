package Practice1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Istisna08 {
    public static void main(String[] args) {
        //IllegalStateException
        // Eger bir method uygun olmayan bir zamanda (yerde) kullanirsak, bize IllegalStateException istisnasini verir

        List<Integer> liste= new ArrayList<>();
        liste.add(21);
        liste.add(22);
        liste.add(23);
        System.out.println(liste);// [21, 22, 23]

        Iterator <Integer> itr = liste.iterator();// [    21,     22,      23]
        itr.next();
        itr.remove();






    }
}
