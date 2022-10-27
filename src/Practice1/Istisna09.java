package Practice1;

public class Istisna09 {
    public static void main(String[] args) {

        try {
            puaniCheckEt(101);
        } catch (IllegalPuanException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void puaniCheckEt(int puan) throws IllegalPuanException{
        if (puan<0 || puan>100 ){
            throw new IllegalPuanException ("Siniva puani 0 ile 100 arasinda olmali");

        }
        System.out.println("Sinav puaniniz: "+ puan);

    }

    private static class IllegalPuanException extends Exception {
        public IllegalPuanException(String mesaj){
            super(mesaj);


        }

    }
}
