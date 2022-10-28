package Practice1;

public class A29 {
    public static void main(String[] args) throws InterruptedException{
        // 10 dk'lik bir tenefusu geriye sayimla ( kod vasitasiyla) yazmak istiyorum
        int dakika = 6;
//        for (int k = saat-1; k>=0;k--) {
            for (int i = dakika-1; i >= 0; i--) {
                for (int j = 59; j >= 0; j--) {

                        Thread.sleep(1000);

                    System.out.println(i + " dakika " + j + " saniye kaldi");
                }

//            }
        }
        System.out.println("vakit doldu");


    }
}
