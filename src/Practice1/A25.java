package Practice1;

import java.util.ArrayList;
import java.util.List;

public class A25 {
    // Bir integer List'te bulunan butun maalari %10 artiran bir kod yaziniz
    //  [5000, 6000, 4500, 3900, 7200]
    public static void main(String[] args) {
        List <Double> maas = new ArrayList<>();
        maas.add(5000.0);
        maas.add(6000.0);
        maas.add(4500.0);
        maas.add(3900.0);
        maas.add(7200.0);
        System.out.println(maas);//[5000.0, 6000.0, 4500.0, 3900.0, 7200.0]

        for (int i =0; i<maas.size(); i++){
            maas.set(i, maas.get(i)*1.1);
        }
        System.out.println(maas);

    }
}
