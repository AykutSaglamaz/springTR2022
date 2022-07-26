package day22dateaccessmodifiers;

import day20arraylists.AccessModifiers03;

public class AccessModifiers02 {

    public static void main(String[] args) {

        /*
         *To access variables from another class you have 2 ways
          1- You can use "class name" ===>> Use that way for "static class members => static must be used
          2-You can use object of the class ====>>> Use that ways for non-static class members

        /*
         * 1- public
         * 2-default
         * 3-protected
         * 4-private
         */

        AccessModifiers01 obj1 = new AccessModifiers01();
        System.out.println(obj1.qa);

        System.out.println(AccessModifiers01.qa1);
        System.out.println(AccessModifiers01.qa2);
        /*Note: if a class member has "default" access modifier, then you CANNOT access to it from another packages.
         		'default" and 'packaged private' are synonyms.
         * we CAN access public variables from ANYWHERE
         * we CANNOT access private variables from outside of the class
         * if a class member is private, you cannot access to it from another classes
         *
         * in Java, same classes can be 'child' of another classes.
         * if something is 'protected', they can be accessed from child classes
         */
        //System.out.println(obj1.qa3);

        System.out.println(obj1.qa4);
        /*
         * we can not call default ones from another package. They should be inside the same package to work with them
         * If you do not type anything for access modifier, it means access modifier is "default"
         */
        AccessModifiers03 obj2 = new AccessModifiers03();
        //System.out.println(obj2.email);

    }
}

