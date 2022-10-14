package Practice1;
/*
    1) ArrayIndexOutOfBoundsException istisina Array'de varolmayan bir index kullandigimizda karsilasiriz
    2) ArrayIndexOutOfBoundsException, unchecked exception'dir

    3) ClassCastException, eger bir data type'ni cast yapmak istersek fakat bu Java tarafindan desteklenmiyorsa bu durumda bu istisnayi aliriz
    4) ClassCastException unchecked exception'dir.

    5) NumberFormatException, eger String icinde sayi olmayan bir karakter kullanirsaniz ve bunu parseInt() uygularsaniz, bu tur istisnayi aliriz
    6) NumberFormatException, unchecked exception'dir.

 */

public class Istisna06 {
    public static void main(String[] args) {

        String str [] = {"A", "B", "C","D"};

        System.out.println(str[2]);

        try {
            System.out.println(str[4]);//ArrayIndexOutOfBoundsException

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" Array'de var olmayan bir index kullandiysaniz 'ArrayIndexOutOfBoundsException' istisnasi alirsiniz "+ e.getMessage());

        }

        //ClassCastException
        try {
            Object t = 70;
            String sayi = (String) t; //ClassCastException
        }catch (ClassCastException e){
            System.out.println(" class cast istisnasi alindi");
        }


        String s1 = "1234";
        System.out.println(s1+ 5);//12345

        int s2 = Integer.parseInt(s1);
        System.out.println(s2+ 5);//1239

        String s3 = "1a2b3c!";

        try {
            int deger = Integer.parseInt(s3);//NumberFormatException
            System.out.println(s3+5);
        }catch (NumberFormatException e){
            System.err.println("String icinde rakam disinda karakter kullanilmistir");

        }

    }
}
