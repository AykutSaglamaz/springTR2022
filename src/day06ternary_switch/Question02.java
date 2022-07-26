package day06ternary_switch;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		/*
			Type java code by using nested if() statement.
			
			Ask user to enter a password 
			
			If the initial of the password is uppercase then check if it is ‘A’ or not. 
			If it is ‘A’ the output will be “Valid Password” 
			otherwise the output will be “Invalid Password”
			For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid
			
			If the initial of the password is lowercase then check if it is ‘z’ or not. 
			If it is ‘z’ the output will be “Valid Password” 
			otherwise the output will be “Invalid Password”
			For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid

			Kullanicidan bir sifre girmesini isteyin
			eger sifrenin ilk harfi buyuk harf ise, bunun 'A' harfi olup olmadigini kontrol edin
			Eger ilk harf 'A' ile basliyorsa "Gecerli Sifre"
			Eger ilk harf 'A' ile baslamiyorsa "Gecersiz Sifre" ciktisi alin
			orn, Ali ==> "Gecerli Sifre" -  ali ==> "Gecersiz Sifre" - Can ==> "Gecersiz Sifre"

			eger sifrenin ilk harfi kucuk harf ise, bunun 'z' harfi olup olmadigini kontrol edin
			Eger ilk harf 'z' ile basliyorsa "Gecerli Sifre"
			Eger ilk harf 'z' ile baslamiyorsa "Gecersiz Sifre" ciktisi alin
			orn, zeynep ==> "Gecerli Sifre" -  zeynep ==> "Gecersiz Sifre" - mehmet ==> "Gecersiz Sifre"
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your password...");
		char initial = scanner.next().charAt(0);
		
		if(initial>='A' &&  initial<='Z') {
			if(initial=='A') {			
				System.out.println("Valid Password");				
			}else {			
				System.out.println("Invalid Password");			
			}			
		}else if(initial>='a' && initial<='z'){			
			if(initial=='z') {			
				System.out.println("Valid Password");			
			}else {			
				System.out.println("Invalid Password");			
			}			
		}else {			
			System.out.println("Use just uppercase or lowercase letters as initial....");	
		}
	}
}

