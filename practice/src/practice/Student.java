package practice;
		
public class Student {		

	 private String firstName,lastName,major;
	  private int classYear;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public int getClassYear() {
		return classYear;
	}
	public void setClassYear(int classYear) {
		this.classYear = classYear;
	}
	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ",major="+ major +",classYear="+ classYear;
	}
	 public void getdata() {
		  firstName="Nishant";
		  lastName="Lakhani";
		  classYear=2020;
		  major="Computer Engineer";
		}
		
		public void display() {
			System.out.println(firstName + "  " +lastName + " " +classYear+" "+major);
		}
		
		public static void main(String[] args) {
			Student s1 = new Student();
			
			s1.getdata();
			s1.display();
			
			Student s11 = new Student();
			s11.setFirstName("Rutu");
			s11.setLastName("Ramani");
			s11.setClassYear(2023);
			s11.setMajor("Biology");
			System.out.println(s11);
		}

}

