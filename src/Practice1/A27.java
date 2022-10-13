package Practice1;

import java.util.Arrays;

public class A27 {

    /* Ebay Mulakat sorusu
     Sifir olan integer Array'deki elemanlari en sona tasiyan bir kod yaziniz
         {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
     */
    public static void main(String[] args) {

        int a []= {3, 0, 4, 0, 5, 0, 45};

        int b[]= new int[a.length];

      int index = 0;

      for (int i =0 ; i<a.length; i++){

          if (a[i]!=0){
              b[index]=a[i];
              index++;
          }
      }

        System.out.println(Arrays.toString(b));
    }


}
