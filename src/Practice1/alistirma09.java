package Practice1;

public class alistirma09 {
    //	Verilen n-1 integer Array'de elemanlar 1 ile 'n' arasindadir
    ///  1,2, 3, 4, ==> 10
    //	Verilen bir integer Array'de, kayip degeri (sayiyi) bulan bir java kodu yaziniz (Array'da tekrar eden eleman yoktur)
    // orn : n=10 ise elemanlari toplami
    // 		toplam = (n*(n+1)/2 = 55

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 6, 5, 7, 9};
        int uzunluk = arr.length+1;// 9

            int k = kayipDeger(arr, uzunluk);
        System.out.println(k);
    }

    public static int kayipDeger(int arr [], int uzunluk){

        int toplam = uzunluk*(uzunluk+1)/2;//45

         for (int i=0; i<arr.length; i++){

             toplam = toplam -arr[i];
         }
        return toplam;
    }

}
