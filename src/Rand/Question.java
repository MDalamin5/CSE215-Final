package Rand;

import java.util.Random;

public class Question implements SharedConstants {
	
	Random rand = new Random();
	
	int ask()
	{
		int Rnum= (int)(100*rand.nextDouble());
		if(Rnum<30) return NO;
		else if(Rnum<60) return YES;
		else if(Rnum<70) return MAYBE;
		else if(Rnum<98) return LATER;
		else return NEVER;
	}

}
