package day34Maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap01 {

    public static void main(String[] args) {
		/*
		 How to count the number of occurrences of the words in a sentence
		 For ex: "Java is easy, Type codes to learn Java. To earn money learn Java."
		 output: Java=3, is=1, easy=1, Type=1, ....learn=2, ....

		 Bir cumlede kullanilan herbir kelimenin kac sefer kullanildigini gosteren bir kod yaziniz
		 Orn: "Java is easy, Type codes to learn Java. To earn money learn Java."
		 output: Java=3, is=1, easy=1, Type=1, ....learn=2, ....
		 */

        String str = "Java is easy, Type codes to learn Java. To earn money learn Java.";

        System.out.println(str);

        str = str.replaceAll("\\p{Punct}", "").toLowerCase();
        System.out.println(str);


        HashMap<String, Integer> result = new HashMap<>();
        String words[]= str.split(" ");

        System.out.println(Arrays.toString(words));

    // to count them use for-each loop
        for(String w:words) {// [Java, is, easy, Type, codes, to, learn, Java, To, earn, money, learn, Java]

            Integer numOfValues = result.get(w);
            if(numOfValues==null) {
                result.put(w, 1);
            }else {
                result.put(w, numOfValues+1);
            }
        }




        System.out.println(result);//{codes=1, java=3, money=1, learn=2, earn=1, is=1, to=2, type=1, easy=1}



        //Type  code to see the number of occurrences of characters in a given String

        String str1 = "Java is easy, Type codes to learn Java. To earn money learn Java.";

        str1 = str1.replaceAll("\\p{Punct}", "").replaceAll(" ", "").toLowerCase();
        System.out.println(str1);

        HashMap<String, Integer> s = new HashMap<>();
        String tr[]= str1.split("");

        System.out.println(Arrays.toString(tr));

        for (String t : tr) {
            Integer numOfChar = s.get(t);

            if(numOfChar==null) {
                s.put(t, 1);

            }else {
                s.put(t, numOfChar+1);
            }
        }
        System.out.println(s);
    }



}