package RandomNumber.java;

import java.util.Random;

public class RandomNumber {
	public static void main(String args[]) {
		
		int numbers[]=new int[20];
		Random rand=new Random();
		
		for(int i=0;i<20;i++) {
			
			numbers[i]=rand.nextInt(6) + 1;
			
			
			boolean inRun = false;
			for(int i1 = 0; i1 < 20; i1++)
			{
				if(inRun)
				{
					if(numbers[i1] != numbers[i1 - 1])
					{
						System.out.print(")");
						inRun = false;
					}
				}
				if(!inRun)
				{
					if(numbers[i1] == numbers[i1 + 1])
					{
						System.out.print("(");
						inRun = true;
					}
				}
				System.out.print(numbers[i1]);
			}
			if(inRun)
			{
				System.out.println(")");
			}
		}
	}
}