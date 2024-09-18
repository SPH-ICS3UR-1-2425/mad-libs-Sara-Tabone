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
		 * (Name) is (negative adjective). On (Date), at (Place), they claimed 
		 * that (noun1)s are x(number) (better/worse) than (noun2s). 
		 * When in reality, (noun1) are only x(decimal) (better/worse) than (noun2).
		 * If only (Name) was smarter, then they'd know that (noun3)s are better than everything. 
		 */
		
		Scanner in = new Scanner(System.in);
    	System.out.println("Welcome to Mad Libs! Prepare to have your mind boggled by this goofy little story!");
		System.out.println("Hello there! Give me a name, any name!");
		String name = in.nextLine();
		System.out.println("Now, give me a negative adjective! Of course, keep it appropiate. This is a highschool project afterall!");
		String negativeadj = in.nextLine();
		System.out.println("Give me a day of the week!");
		String DOTW = in.nextLine();
		System.out.println("Now, give me place!");
		String place = in.nextLine();
		System.out.println("Give me a noun, any noun!");
		String noun1 = in.nextLine();
		System.out.println("Here's a fun one. Give me a number!");
		int num = in.nextInt();
		System.out.println("Here's an easy one. You get to choose one of two words: Better or Worse?");
		//flush
		in.nextLine();
		String betterworse = in.nextLine();
		System.out.println("Choose a second noun!");
		String noun2 = in.nextLine();
		System.out.println (name+" is "+negativeadj+". On "+DOTW+", at "+place+", they claimed that "+noun1+"s are x"+num+" than "+noun2+"s."); 
		in.close();
	}

}
