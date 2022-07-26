package day25encapsulationandinteviewquestions;

public class InterviewQuestions05 {

    public static void main(String[] args) {

        // Create a method to check if a number is armstrong or not
        //153 is an armstromg number
        //1*1*1  +  5*5*5  +  3*3*3 =153

        int num = 153, number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");


    }

}
