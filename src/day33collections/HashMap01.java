package day33collections;

import java.util.HashMap;

public class HashMap01 {
    /*
         1) HasMap does not put the elements in any order because of that it is fast
         2) Keys must be unique in Maps, if you try to put repeated key, Java will overwrite (update previous one)
         3) Values can be repeated in Maps
         4) We can use null in Keys but you can use it just once
             We can use null in Values repeatedly without issues
         6) HasMaps are non thread-safe (doing multi-task at the same time) and not synchronized (putting in order)
     */
    public static void main(String[] args) {

        HashMap <Integer, String> hm1 = new HashMap<>();

        hm1.put(100, "AliCan");
        hm1.put(101, "VeliCan");
        hm1.put(102, "Mark Stone");
        hm1.put(103, "Angie Ocean");
        hm1.put(103, "Kemal Can");
        hm1.put(104, "Angie Ocean");
        hm1.put(null, "Angie Ocean");
        hm1.put(105, null);
        hm1.put(106, null);

        System.out.println(	hm1.get(100)) ;//we put the Key and return the Value 100 -->>> AliCan

        //For non-existing keys it returns null
        System.out.println(hm1.get(109));//null

        //For non-existing keys it returns, what you put there
        System.out.println( hm1.getOrDefault(109, "No value for that key"));//No value for that key

        //Returns the keys in a Set Collection
        hm1.keySet();
        System.out.println(hm1.keySet());//[null, 100, 101, 102, 103, 104, 105, 106]

        hm1.values();// returns all values

        System.out.println(hm1.values());//[Angie Ocean, AliCan, VeliCan, Mark Stone, Kemal Can, Angie Ocean, null, null]

        System.out.println(hm1.containsKey(102));//true
        System.out.println(hm1.containsKey(107));//false

        System.out.println(hm1.containsValue("Mark Stone")); //true
        System.out.println(hm1.containsValue("Johny Jones")); //false


        HashMap <Integer, String> hm2 = new HashMap<>();

        hm2.put(110, "X");
        hm2.put(111, "Y");
        hm2.put(112, "Z");
        hm1.putAll(hm2);//Copies all of the mappings from the specified map to this map.

        hm1.putIfAbsent(110, "W");//If the key exists, it does not change existing value, otherwise create new key-value

        // replace() is used to updated value by using key
        //If you use replace() with a non-existing key, it will do nothing
        System.out.println(hm1.replace(112, "ZZ"));//Z-->> Returns previous value

        //Following replace() does check for key and value, if both match then it does update.
        hm1.replace(112, "ZZ", "????");

        System.out.println(hm1.size());//11 --> returns number of element in the HashMap

        System.out.println(hm1);//{null=Angie Ocean, 112=Z, 100=AliCan, 101=VeliCan, 102=Mark Stone, 103=Kemal Can, 104=Angie Ocean, 105=null, 106=null, 110=X, 111=Y}

    }

}