package person;

class Person{
	 String name;
	 int age;
	 
	 public Person(String name , int age) {
		 this.name = name ;
		 this.age = age;
	 }
	 
	 public void display()
	 {
		 System.out.println(name+" is "+age+" years old" );
		 
			 
      }
	  }
 
 public class PersonDemo{
	 public static void main(String[] args) {
	 Person p1 = new Person("Vicks", 18);
	 p1.display();
 }
}
