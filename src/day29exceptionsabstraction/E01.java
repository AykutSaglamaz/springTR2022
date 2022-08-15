package day29exceptionsabstraction;

import java.util.Scanner;

import day30exceptionsinterfacesiteratorscollections.I01;

public class E01 {
	/*
                        THROW
        - Throw keyword is used to throw an exception explicitly.
        - only single exception is thrown by using throw.
        - Throw keyword is used within the method.
        - Syntax wise throw keyword is followed by the instance variable.

       - Throw anahtar sözcüğü, açıkça bir istisna atmak için kullanılır.
       - Throw anahtar sözcüğü kullanılarak yalnızca tek bir istisna atılır.
       - Throw anahtar sözcüğü yalnizca method icinde kullanilir.
       - Throw anahtar sözcüğünu, bir instance variable izler.
       - Checked exception'lar yalnizca throw ile halledilemez.

                        THROWS
        - Throws keyword is used to declare one or more exceptions, separated by commas.
        - Multiple exceptions can be thrown by using throws.
        - Throws keyword is used with the method signature.
        - Syntax wise throws keyword is followed by exception class names.

        - Throws anahtar sözcüğü, virgülle ayırarak bir veya daha fazla istisna bildirmek için kullanılır.
		- Throws anahtar sözcüğü, birden çok istisna icin atılabilir.
		- Throws anahtar sözcüğü method signature ile kullanilir.
		- Throws anahtar sözcüğunu exception class'i izler
		- Checked exception'lar throws ile halledilebilir.


    */
	public static void main(String[] args) {


		//illigalArgumentException
		// Sometimes we do not want to use some values for some parameters.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age...");
		int age = scanner.nextInt();



		try {
			setAge(age);
		} catch (Exception e) {
			System.out.println("Do not use negative values for ages...");
		}
		scanner.close();


	}


	public static void setAge(int age) throws IllegalArgumentException{

		if (age<0) {
			throw new IllegalArgumentException();
		}else {

			System.out.println("Your age is "+age);

		}
	}

}