package day03increment_decrement_operators;

public class Decrement01_02 {

	public static void main(String[] args) {
		
		int weight = 120;
		System.out.println("Before decrement: " + weight);//120
		
		
		//How to decrease the value of a variable by subtraction
		//1.Way
		weight = weight - 20;
		System.out.println("After decrement: " + weight);//100		
		//2.Way
		weight-=10;
		System.out.println("After 2nd decrement: " + weight);//90		
		//3.Way: This is used just to decrease by 1
		weight--;
		System.out.println("After 3rd decrement: " + weight);//89
		
		int population = 24000;
		System.out.println("Before decrement: " + population);
		
		//How to decrease the value of a variable by division
		//1.Way
		population = population / 2;
		System.out.println("After decrement: " + population);
		
		//2.Way
		population /= 3;
		System.out.println("After 2nd decrement: " + population);
		
		int aliSalary = 600;
		int veliSalary = 500;
		
		//Q: Decrease Ali's salary 20% then increase it by 100 dollars.
		//   Increase Veli's salary 100 dollars then decrease it by 20%.
		//   Then compare their salaries?
		
		//If you multiply int by double the result will be double
		aliSalary = (int)(aliSalary*0.80);
		aliSalary = aliSalary + 100;
		System.out.println("Ali Salary: " + aliSalary);
		
		veliSalary = veliSalary + 100;
		veliSalary = (int)(veliSalary*0.80);
		System.out.println("Veli Salary: " + veliSalary);

	}

}
