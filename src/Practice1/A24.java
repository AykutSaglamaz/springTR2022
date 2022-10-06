package Practice1;

public class A24 {
    public static void main(String[] args) {
        /*
        Bir String'in Palindrome olup olmadigini check eden bir kod yaziniz
        Palindrome: kelimenin tersten yazilisi kendisine esit "121" ==> 121, veya "123321", "nalan", "ey edip adanada pide ye", "racecar"
         */

        String s = "ey edip adanada pie ye";
         String tertenS = "";
         int sonInx = s.length()-1;
         while (sonInx>-1){
           tertenS = tertenS +   s.charAt(sonInx);
           sonInx--;

         }

         if (s.equals(tertenS)){
             System.out.println("Bu bir palindrom");
         }else{
             System.out.println("bu bir palindrom degildir");
         }


    }
}
