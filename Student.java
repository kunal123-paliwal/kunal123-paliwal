
 public class Student {
	
 static final String Institute_name= "ABC INSTITUTE";
 int rollno;
 int age;
 String name;
 
	 public Student(int r, int a, String n) {
		// TODO Auto-generated constructor stub
	rollno =r;
	age =a;
	name =n;
	 }
	
	void display ()
	{
		System.out.println(rollno+" "+age+" "+name+" "+Institute_name);
	 }  
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student(101,24,"KUNAL");
		Student s2= new Student(102,75,"ABHAY");
		Student s3= new Student(103,04,"YASH");
		
		s1.display();
		s2.display();
		s3.display();
	}




	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}