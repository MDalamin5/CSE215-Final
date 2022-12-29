package FFinal;
import DeletArr.Demo;
public class Private extends Demo{
	private int age;
	
	
	public Private() {
		// TODO Auto-generated constructor stub
	}
	public Private(int age) {
		this.age=age;
	}
	
	void setAge(int age)
	{
		this.age=age;
	}
	
	int getAge()
	{
		return age;
	}
	
}
