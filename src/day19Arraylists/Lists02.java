package day19Arraylists;

import java.util.ArrayList;

public class Lists02 {

    public static void main(String[] args) {

        // How to update an element
        // Bir elementi nasil guncelleriz

        ArrayList <String>listStr = new ArrayList<>();


        listStr.add("Ali");
        listStr.add("Veli'");
        listStr.add("Bahar");
        listStr.add("Zeki");
        listStr.add("Umay");
        listStr.add("Muhammet");
        listStr.add("Kaan");
        listStr.add("Leyla");


        System.out.println(listStr);  //[Ali, Veli', Bahar, Zeki, Umay, Muhammet, Kaan, Leyla]

        //How to remove an element from the list >>by index
        //Bir list'ten bir elementi nasil sileriz
        listStr.remove(5);// it removes X by using its index>> it removes 'Muhammet'

        listStr.remove(listStr.indexOf("Zeki")); // to remove a specific number in list >> it removes 'Zeki'

        System.out.println(listStr);//[Ali, Veli', Bahar, Umay, Kaan, Leyla]

        // set = remove + add;
        //We use set to update a value of an element
        //Set methodu bir elementin degerini guncellemek icin kullanilir

        listStr.set(1, "Selen"); // 1 parameter index of the element to replace
        //	element to be stored at the specified position

        System.out.println("After setting a value: "+ listStr);  //After setting a value: [Ali, Selen, Bahar, Zeki, Umay, Muhammet, Kaan, Leyla]

        listStr.set(listStr.indexOf("Ali"), "Mecnun");

        System.out.println(listStr);   //[Mecnun, Selen, Bahar, Zeki, Umay, Muhammet, Kaan, Leyla]



    }

}
