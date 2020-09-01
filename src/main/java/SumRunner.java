import java.util.Scanner;
import java.lang.*;

public class SumRunner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1=0; //first number
        int number2=0; //second number in range, or Sum if no range is presented
        int number_current=0; //the current tick number while counting up to the input number
        String numberRange; //the raw input number, to be broken down into number 1 and 2 if a hyphen is present
        int hyphenPosition; //the index of the hyphen in the number range
        int rangeSum=0;

        System.out.println("Please input an Integer to be added, \nor a range of integers(lower then higher,separated by a hyphen):");

        numberRange=input.nextLine();
        hyphenPosition=numberRange.indexOf('-');//should return the index of a Hyphen within the string numberRange, or return - if there is none

        if (hyphenPosition==-1){ //if there is NO hyphen in the input, then add up all numbers up to the input number...
            number1 = Integer.parseInt(numberRange); //transform the input into an integer for number1
            while(number_current!=number1) { //while the current count is less than the input number....
                number_current++;//increase the number_current per tick...
                number2 += number_current;// and add it to number 2(the final sum)
            }
            System.out.println(number2+" ( "); //start printing off by printing the Sum of all numbers_(_....
            for(int i=1;i<=Integer.parseInt(numberRange);i++) {
                System.out.print(i +" + ");
            }
            System.out.print(")");
        }
        else{
            number1= Integer.parseInt(numberRange.substring(0,hyphenPosition)); //generates number 1
            number2= Integer.parseInt(numberRange.substring(hyphenPosition+1,numberRange.length())); //generates number 2
            if (number1>=number2){
                System.out.println("Error, your second number MUST be higher than your first.");
                System.exit(0);
            }
            number_current= number1; //set the count to start at the first number instead of 0
            while(number_current<=number2) { //while the current count is less than the second input number....
                number_current++;//increase the number_current per tick...
                rangeSum += number_current;// and add it to rangeSum (the final sum)
            }
            System.out.println(rangeSum +" ( "); //start printing off by printing the Sum of all numbers_(_....

            for(int i=number1;i<=number2;i++) {
                System.out.print(i +" + ");
            }
            System.out.print(")");
        }
    }
}