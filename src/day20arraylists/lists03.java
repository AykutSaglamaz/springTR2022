package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class lists03 {

    public static void main(String[] args) {



		/*
		 Create a method to delete odd elements and multiply even elements by 3 from the list
		 */

        List<Integer> list1 = new ArrayList<>();

        list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(8);
        list1.add(7);

//        multiplyEvenNumbersByThree(list1);

        sss(list1);

    }


    public static void sss (List<Integer>list1) {

        for (int i = 0; i<list1.size(); i++) {
            if (list1.get(i)%2!=0) {
                list1.remove(i);
                i--;
            }else {
                list1.set(i, list1.get(i)*3);
            }

        }
        System.out.println(list1);
    }





//	public static void multiplyEvenNumbersByThree(List<Integer>list) {
//
//		for (int i = 0; i<list.size(); i++) {
//
//			if(list.get(i)%2!=0) {
//				list.remove(i);
//				i--;
//
//			}else {
//				list.set(i, list.get(i)*3);
//			}
//		}System.out.println(list); //[6, 18, 24]


//	}


}
