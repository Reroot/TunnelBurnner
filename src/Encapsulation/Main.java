package Encapsulation;

public class Main {
	public static void main(String[] args) {
		Student s = new Student();
//		BAD use getters and setter instead. Encap 1
//		s.name = "koops";
//		System.out.println(s.name);
		s.setAge(5);
		s.setName("Koopa");
		System.out.println("My name is " + s.getName() + " and I'm " + 
		s.getAge());
		//now we are out decreasing reps and avoiding dependecy
		
		//we also need to keep things private with the fields in the 
		//strudent class, that way the data is encapusalted with 
		//private final fields
		
		//the concept of enapulation is binding data with methods that
		//are public
	}
}
