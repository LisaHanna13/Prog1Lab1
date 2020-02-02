/*
Lisa Hanna
31 Jan, 2020
Step 5 of Lab1 -- App that converts Canadian money to USD & EUR
*/
import java.util.Scanner;
public class CurrencyConversion{

	public static void main(String[] args){
		//create a scanner for user input
		Scanner keyboard = new Scanner(System.in);
		//Print out instructions
		System.out.print("Hello, please enter an amount of money (CAD): ");
		//Store the user input
		double cadMoney = keyboard.nextDouble();

		//convert CAD money to USD
		double usdMoney = cadMoney * 0.76;
		//convert CAD money to EUR
		double eurMoney = cadMoney * 0.68;

		//Print out the results
		System.out.println(cadMoney + " CAD is equal to " + usdMoney + " USD, and " + eurMoney + " EUR");


	}
}
