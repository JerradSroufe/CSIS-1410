/* Jerrad Sroufe	
 * CSIS 1410
 * Homework 1
 */
package src;

import java.util.Scanner;

public class Tester {

	public static void main(String[] ars) {
		Time time1 = new Time();
		Time time2 = new Time(555550000L);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Current Time:");
		System.out.print("  ");
		printTime(time1);
		
		System.out.println("Time 555,550,000 milliseconds after January 1st, 1970:");
		System.out.print("  ");
		printTime(time2);
		
		System.out.println("Please check the README file");
		in.nextLine();
		in.close();
		
	}
	
	public static void printTime(Time time) {
		String stringTime = "";
		stringTime += time.getHour()+":";
		stringTime += String.format("%02d" , time.getMinute()) + ":";
		stringTime += String.format("%02d" , time.getSecond());
		System.out.println(stringTime);		
	}
	

}
