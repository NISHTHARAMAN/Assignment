package getterandsetter;

public class Clock {
	
	private int hours;
	private int minutes;
	private int seconds;
	
	public Clock() {
		this.hours = 12;
		this.minutes = 0;
		this.seconds = 0;
	}

	

	public Clock(int hours,int minutes,int seconds) { 
		   
		  this.hours = hours; 
		  this.minutes = minutes; 
		  this.seconds = seconds; 
		   
		 } 
		  
public void setClock(int seconds) { 
	System.out.println(" Total No Of Seconds :  "+seconds); 
		   
		  if(seconds<=60) { 
		   System.out.println("Seconds :  "+seconds); 
		  } 
		  else if(seconds>60){ 
		    
		   int temp = seconds/60; 
		   int temp2 = seconds%60; 
		   int temp3 = seconds/3600; 
		   System.out.println("Minutes : "+temp+" \n"+"Seconds : "+temp2+" \n"+"Hourse : "+temp3); 
		  } 
		 } 

public void secincrement() { 
			   
			  seconds++; 
			   
			 } 
			  
			 public void secdecrement() { 
			   
			  seconds++; 
			   
			 }
		 
			 public int getHours() { 
				  return hours; 
				 } 
				 
				 
				 public void setHours(int hours) { 
				  this.hours = hours; 
				 } 
				 
				 
				 public int getMinutes() { 
				  return minutes; 
				 } 
				 
				 
				 public void setMinutes(int minutes) { 
				  this.minutes = minutes; 
				 } 
				 
				 
				 public int getSeconds() { 
				  return seconds; 
				 } 
				 
				 
				 public void setSeconds(int seconds) { 
				  this.seconds = seconds; 
				 } 
				  
				  
				 public void substractClock(int sec) { 
				   
				   
				  int temp = seconds - sec; 
				  System.out.println("Diffrence of Seconds : "+ temp); 
				   
				   
				   
				   
				 } 
				 
				 
				 @Override 
				 public String toString() { 
				  return "Clock [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]"; 
				 } 
	
	
	
}
