package Practice1;

public class A23 {
    /*
    Verilen bir Array'den toplami 10 eden kac sayi cifti kullanildigini bulan bir kod yaziniz {4, 6, 5, -10, 8, 5, 20}
     */
    public static void main(String[] args) {
        int a[]= {4, 6, 5, -10, 8, 5, 20};
        sayiCifti(a, 10);

    }

    public static void sayiCifti(int a[], int toplam){
       int sayac = 0;

       for (int i =0; i< a.length; i++){

           for (int k = i+1; k<a.length; k++ ){

              if (a[i]+ a[k]==toplam){

                  System.out.println(a[i] + "+"+ a[k]+ "="+ toplam);

                  sayac++;
              }
           }
       }
        System.out.println(sayac);

        if (sayac==0){

            System.out.println("toplami "+ toplam + " esit olan sayi cifti yoktur");
        }

    }

}
