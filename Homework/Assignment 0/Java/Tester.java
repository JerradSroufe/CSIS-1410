/*Jerrad Sroufe
 *CSIS 1410
 *Homework 0
 *8/24/16
 */

public class Tester {
	public static void main(String [] args) {
		Rectangle rectangle1 = new Rectangle(4 , 40);
		Rectangle rectangle2 = new Rectangle(3.5 , 35.9);
		
		describe(rectangle1);
		describe(rectangle2);
	}
	
	public static void describe(Rectangle rectangle) {	
		String description = "";
		description += "Width: " + rectangle.getWidth() + "\n";
		description += "Height: " + rectangle.getHeight() + "\n";
		description += "Perimiter: " + rectangle.getPerimiter() + "\n";
		System.out.println(description);
	}
}
