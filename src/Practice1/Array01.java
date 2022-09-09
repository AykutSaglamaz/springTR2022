package Practice1;

import java.util.Arrays;
import java.util.List;

public class Array01 {
    public static void main(String[] args) {
        //1) Arrays ayni container icinde cok sayi data depolamamiz icin vardir
        // 2) Arrays de butun elementler MUTLAKA ayni data tipinde olmali
        // 3) Arrays sadece 'primitive' ve non-primitive' datalarin referanslarini data tipi olarak kabul eder

        int arr[] = new int[3];

        System.out.println(Arrays.toString(arr));// [ 0,  0,   0]
//deger atamak
        arr[1]=11;
        arr[0]=12;
        arr[2]=14;
//        arr[3]=16; //ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(arr)); // [12, 11, 14]

        System.out.println(arr[1]); //11

      String str[]= new String[5];
        System.out.println(Arrays.toString(str));// [null, null, null, null, null]

        str[0]="Ali Can";
        str[1]="Veli han";
        str[2]="Mehmet can";
        str[3]="Ayse Tan";
        str[4]="Ahmet Kan";
        System.out.println(Arrays.toString(str)); //[Ali Can, Veli han, Mehmet can, Ayse Tan, Ahmet Kan]


        String str1[]= {"Ali Can", "Veli han", "Mehmet can", "Zeynep Tan", "Kaan Kan"};
        Arrays.sort(str1);
        for (int i =0; i<str1.length; i++){
            System.out.println(str1[i]);// tek tek yazdirmak icin for loop yapalim

        }
        System.out.println(Arrays.toString(str1)); // array olarak siralamak istersek



    }
}
