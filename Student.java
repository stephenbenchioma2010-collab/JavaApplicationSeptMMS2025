public class Student{
	int studentID;
	String firstName;
	String lastName;
	char gender;
	
	public Student(int studentID,String firstName,String lastName,char gender){
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public void eat(){
		System.out.print("i am eating");
	}
	public void sleep(){
		System.out.print("i am sleeping");
	}
	public void sing(){
		System.out.print("i am singing");
	}
	public void displayStudentInfo(){
		System.out.println("StudentID: " + studentID);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Gender: " + gender);
	}
}