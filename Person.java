abstract class Person{
	String name;
	int age;
	String phoneNumber;
	
	public Person(String name,int age,String phoneNumber){
		this.name = name;
		this.age = age;
		this.phoeNumber = phoneNumber;
	}	
	void sing(){
		System.out.println("I am singing");
	}
	
	abstract void dance();
}