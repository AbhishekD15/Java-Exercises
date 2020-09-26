//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 01
// Practical Exam Number: 05
//===================================

//class student
public class Student{
	private String name;
	private int age;
	private int period;

	//accessors and mutators

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age=age;
	}

	public int getAge(){
		return age;
	}

	public void setPeriod(int period){
		this.period=period;
	}

	public int getPeriod(){
		return period;
	}


	//basic constructor to initialise attributes to default values
	public Student(){
		this.name="unknown";
		this.age=0;
		this.period=0;
	}


	//parameterised constructor 
	 public Student(String tmpName, int tmpAge, int tmpPeriod){
	 	this.name=tmpName;
	 	this.age=tmpAge;
	 	this.period=tmpPeriod;
	 }

}