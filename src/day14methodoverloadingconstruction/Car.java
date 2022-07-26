package day14methodoverloadingconstruction;

public class Car {
	
	String make;
	int price;
	int year;
	String model;
	String color;
	static int soldCarCounter = 0;

	public static void main(String[] args) {
		
		//to create object ==> ClassName   ObjectName = new Constructor
		    Car         car01    = new Car("Audi", 20000, 2017, "Q5", "Black");
		    System.out.println(car01.make);
		    System.out.println(car01.price);
		    System.out.println(car01.year);
		    System.out.println(car01.model);
		    System.out.println(car01.color);
		    
		    Car         car02    = new Car("Honda", 15000, 2019, "CRV", "Red");
		    System.out.println(car02.make);
		    System.out.println(car02.price);
		    System.out.println(car02.year);
		    System.out.println(car02.model);
		    System.out.println(car02.color);
		    
		    Car         car03    = new Car("Lexus", 22000, 2020, "RC2000");
		    System.out.println(car03.make);
		    System.out.println(car03.price);
		    System.out.println(car03.year);
		    System.out.println(car03.model);
		    
		    Car         car04    = new Car(22000, 2020);
		    System.out.println(car04.price);
		    System.out.println(car04.year);
		    
		    Car         car05    = new Car();
		    System.out.println(car05.make);//default value ==> null
		    System.out.println(car05.price);//default value ==> 0
		    System.out.println(car05.year);//default value ==> 0
		    System.out.println(car05.model);//default value ==> null
		    System.out.println(car05.color);//default value ==> null
		     
		    System.out.println(soldCarCounter);//5
		    //When you want to look at the value of a class variable, no need to use objects.
		    System.out.println(car01.soldCarCounter);//5
		    System.out.println(car02.soldCarCounter);//5
		    System.out.println(car03.soldCarCounter);//5
		    
	}
	
	public Car(String make, int price, int year, String model, String color) {		
		this.make = make;		
		this.price = price;		
		this.year = year;		
		this.model = model;		
		this.color = color;		
		soldCarCounter++;		
	}
	
	public Car(String make, int price, int year, String model){
		
		this.make = make;
		this.price = price;	
		this.year = year;
		this.model = model;	
		soldCarCounter++;
		
	}
	
	public Car(int price, int year){

		this.price = price;	
		this.year = year;
		soldCarCounter++;
		
	}
	
	public Car(){
		
		soldCarCounter++;	
		
	}
}
