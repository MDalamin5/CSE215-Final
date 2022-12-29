package Rand;

public class AskMe implements SharedConstants{
	
	static void answer(int result)
	{
		switch(result)
		{
		case NO: System.out.println("NO"); break;
		case YES: System.out.println("yes"); break;
		case MAYBE: System.out.println("maybe"); break;
		case LATER: System.out.println("later"); break;
		case NEVER: System.out.println("Never"); break;
		}
		
	}

}
