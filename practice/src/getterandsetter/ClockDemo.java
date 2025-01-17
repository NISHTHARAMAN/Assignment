package getterandsetter;

public class ClockDemo {

	public static void main(String[] args) {
		 Clock c2 = new Clock(12,5,38); 
		  System.out.println(c2);  
		   
		   
		  c2.setClock(7265); 
		  
		  c2.setHours(5); 
		  c2.setMinutes(45); 
		  c2.setSeconds(50); 
		  c2.secincrement(); 
		  System.out.println("Hourse : "+c2.getHours()+"  "+" Minutes : " +c2.getMinutes()+"  "+"Seconds : "+c2.getSeconds()); 
		   
		  c2.secdecrement(); 
		  System.out.println("Hourse : "+c2.getHours()+"  "+" Minutes : " +c2.getMinutes()+"  "+"Seconds : "+c2.getSeconds()); 
		   
		  c2.substractClock(45); 
		   
		 
		   
		 }

	}



//Question 2
//
//Write a Java class Clock for dealing with the day time represented by hours, minutes, and seconds. Your class must have the following features:
//
//Three instance variables for the hours (range 0 - 23), minutes (range 0 - 59), and seconds (range 0 - 59).
//Three constructors:
//default (with no parameters passed; is should initialize the represented time to 12:0:0)
//a constructor with three parameters: hours, minutes, and seconds.
//a constructor with one parameter: the value of time in seconds since midnight (it should be converted into the time value in hours, minutes, and seconds)
//Instance methods:
//a set-method method setClock() with one parameter seconds since midnight (to be converted into the time value in hours, minutes, and seconds as above).
//get-methods getHours(), getMinutes(), getSeconds() with no parameters that return the corresponding values.
//set-methods setHours(), setMinutes(), setSeconds() with one parameter each that set up the corresponding instance variables.
//method tick() with no parameters that increments the time stored in a Clock object by one second.
//method addClock() accepting an object of type Clock as a parameter. The method should add the time represented by the parameter class to the time represented in the current class.
//Add an instance method toString() with no parameters to your class. toString() must return a String representation of the Clock object in the form "(hh:mm:ss)", for example "(03:02:34)".
//Add an instance method tickDown() which decrements the time stored in a Clock object by one second.
//Add an instance method subtractClock() that takes one Clock parameter and returns the difference between the time represented in the current Clock object and the one represented by the Clock parameter. Difference of time should be returned as an clock object.
//Write a separate class ClockDemo with a main() method. The program should:
//
//instantiate a Clock object firstClock using one integer seconds since midnight obtained from the keyboard.
//tick the clock ten times by applying its tick() method and print out the time after each tick.
//Extend your code by appending to it instructions instantiating a Clock object  secondClock by using three integers (hours, minutes, seconds) read from the keyboard.
//Then tick the clock ten times, printing the time after each tick.
//Add the secondClock time in firstClock by calling method addClock.
//Print both clock objects calling toString method
//Create a reference thirdClock that should reference to object of difference of firstClock and secondClock by calling the method subtractClock().


