package ComperSort;


public class Student  {
	
	String name;
	int id;
	int year;
	public Student(String name, int id, int year) {
		super();
		this.name = name;
		this.id = id;
		this.year = year;
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getId()
	{
		return id;
	}
	public int getYear()
	{
		return year;
	}
  
	@Override
	public String toString() {
		return this.name + " " + this.id + " " + this.year;
	}
	
	
	
	
	
	
	
	
	
	

}
