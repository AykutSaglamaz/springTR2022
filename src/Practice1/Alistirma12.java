package Practice1;

import java.util.Arrays;

public class Alistirma12 {

    public static void main(String[] args) {
        int arr [][] = new int[3][2];

        System.out.println(Arrays.deepToString(arr)); //[[0, 0], [0, 0], [0, 0]]
        arr [0][1]= 12;
        arr [2][0]= 27;

        System.out.println(Arrays.deepToString(arr)); //[[0, 12], [0, 0], [27, 0]]

        int brr [][] = { {2, 3}, {12, 13, 14, 16, 15}, {-2, -3, -4}};

        System.out.println(Arrays.deepToString(brr)); //[[2, 3], [12, 13, 14, 16, 15], [-2, -3, -4]]

            // crr [][]= { {2, 3}, {12, 13, 14}};
       // Array'in elemanlarinin sayisal toplamini veren bir kod yaziniz

        int crr [][]= { {2, 3}, {12, 13, 14}};

        int toplam = 0;

            for (int i =0; i<crr.length; i++){


                for (int j =0; j<crr[i].length; j++){


                    toplam = toplam + crr[i][j];

                }
            }
        System.out.println(toplam); //44
    }
}
