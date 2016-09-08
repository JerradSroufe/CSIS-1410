/* Jerrad Sroufe	
 * CSIS 1410
 * Homework 1
 */
package src;

import java.text.SimpleDateFormat;

public class Time {
	//================|
	//---Variables----|
	//================V
	int hour;
	int minute;
	int second;
	//================A
	//---Variables----|
	//================|
	
	
	//================|
	//--Constructors--|
	//================V
	public Time() {
		setTime(System.currentTimeMillis());
	}
	
	public Time(long timeSinceEpoch) {
		setTime(timeSinceEpoch);
	}
	
	public Time(int hour , int minute , int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	//================A
	//--Constructors--|
	//================|
	
	
	//================|
	//----Getters-----|
	//================V
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	//================A
	//----Getters-----|
	//================|
	
	
	//================|
	//----Setters-----|
	//================V
	public void setTime(long elapsedTime) {
		SimpleDateFormat epochHour = new SimpleDateFormat("hh");
		this.hour = Integer.parseInt(epochHour.format(elapsedTime));
		
		SimpleDateFormat epochMinute = new SimpleDateFormat("mm");
		this.minute = Integer.parseInt(epochMinute.format(elapsedTime));
		
		SimpleDateFormat epochSecond = new SimpleDateFormat("ss");
		this.second = Integer.parseInt(epochSecond.format(elapsedTime));
	}
	//================A
	//----Setters-----|
	//================|	
	
	
}
