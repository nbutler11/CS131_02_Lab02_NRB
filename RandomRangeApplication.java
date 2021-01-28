
public class RandomRangeApplication {
	public static void main(String[] args) {
		RandomRange rand1 = new RandomRange();
		
		for(int count=1; count<10; count++) {
			rand1.randomInRange(18, 17);
			System.out.println(rand1.randomInRange(18, 17));
		}
	}

}
