/*Jerrad Sroufe
 *CSIS 1410
 *Homework 0
 *8/24/16
 */

public class Rectangle {
	//================|
	//----Variables---|
	//================V
	
	private double width = 1;
	private double height = 1;
	
	//================A
	//----Variables---|
	//================|

	
	//================|
	//--Constructors--|
	//================V
	
	Rectangle() {
		
	}
	
	Rectangle(double width , double height) {
		this.width = width;
		this.height = height;		
	}
	
	//================A
	//--Constructors--|
	//================|
	
	
	//================|
	//-----Getters----|
	//================V
	
	public double getWidth() {	//the project doesn't explicitly say to make this, but it makes things a lot easier
		return width;
	}
	
	public double getHeight() {	//the project doesn't explicitly say to make this, but it makes things a lot easier
		return height;
	}
	
	public double getArea() {	//the project doesn't actually have you display this, but you still make it cos it says to
		return height * width;

	}
	
	public double getPerimiter() {
		return height + width * 2;
	}
	
	
	
	//================A
	//-----Getters----|
	//================|
}
