package Practice1;

import java.util.Arrays;

public class Alistirma07 {

    //Verilen bir String'deki karakterleri A'dan Z'ye siralayiniz
    // orn: str = "Hosgeldiniz";
    //

    public static void main(String[] args) {

        String str = "hosg";
        char gecici= 0;
        char arr[] = str.toCharArray();// str.split("") //  [H,      o,      s,    g,    e,    l,     d,    i,    n,    i,    z]
        System.out.print(Arrays.toString(arr)+"\n");

        for (int i=0; i< arr.length; i++ ){

            for (int j=0;j< arr.length; j++ ){

                if (arr[j]> arr[i]){

                    gecici = arr[i];

                    arr[i] = arr[j];

                    arr[j] = gecici;

                }

            }

        }
        System.out.println(Arrays.toString(arr));





    }

}
