import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: Sara
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 * (Name) is (adjective). They claim that (noun1)s are (number)x (better/worse)
		 * than (noun2s). When in reality, (noun1) are only (decimal)x (better/worse) than (noun2).
		 *  
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("Give me a number: ");
		int num1 = in.nextInt ();
		System.out.println("Give me a place: ");
		//flush
		String place = in.nextLine();
		System.out.println ("One day, "+name+" wrote "+num1+" Mad Libs in "+place+"!"); 
	}

}
