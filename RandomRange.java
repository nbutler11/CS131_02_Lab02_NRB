import java.util.Random;

public class RandomRange {
	
	public RandomRange(){
		
	}
	
	public static int randomInRange(int a, int b) {
		int range = b-a;
		if(range>=0) {
			Random rand = new Random();
			int number = rand.nextInt(range+1)+a;
			return number;
		}
		else
			return 0;
	}
}
