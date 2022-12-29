package Rand;

public class DriverClass {
	public static void main(String[] args) {
		
		Question ob = new Question();
		
		AskMe.answer(ob.ask());
		AskMe.answer(ob.ask());
		AskMe.answer(ob.ask());
		AskMe.answer(ob.ask());
	}

}
