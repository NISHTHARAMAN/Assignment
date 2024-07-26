//write a program to print the name of student by creating s atudent class. if no name is passed while creating an object of student class. then the name should be "unknown" , otherwise the name should be equal to the string value passed while creating object of student class for java.

package practice;

public class Student1 {
	
	private String name;
	
	

	public Student1() {
		this.name = "unknow";
	}
	
	public Student1(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + "]";
	}

	public static void main(String[] args) {
		Student1 s1 = new Student1 ();
		System.out.println(s1);
		
		Student1 s2 = new Student1 ("Nishtha");
		System.out.println(s2);

	}

}
