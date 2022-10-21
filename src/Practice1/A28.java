package Practice1;

public class A28 {
    public static void main(String[] args) throws InterruptedException {
        int gun=1;
        for(int  i = gun-1; i>=0; i-- ){
            for (int j =24; j>=0; j--){
                for(int k= 60;k>=0; k--){
                    Thread.sleep(1000);

                    System.out.println(i+":"+j+":"+k);
                }
            }
            System.out.println("Times up");
        }

    }
}
