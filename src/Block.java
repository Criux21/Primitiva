import java.util.Arrays;

public class Block {
	 
	private int[] numbers;
	
	public Block(int numNumbers) {
		
		if (numNumbers < 6) {
			numNumbers = 6;
		}
		if (numNumbers > 49) {
			numNumbers = 49;
		}
		
		numbers = new int[numNumbers];
		
		int goodNumbers = 0;
		while(goodNumbers < numNumbers) {
			
			int n = (int)(Math.random()*49) + 1;
			boolean repeted = false;
			int i = 0;
			while ( i < goodNumbers && !repeted) {
				if (n == numbers[i]) {
					repeted = true;
				}
				i++;
			}
			if (!repeted) {
				numbers[goodNumbers] = n;
				goodNumbers++;
			}
		}
		Arrays.sort(numbers);
	}
	
	public Block(int ... numbers) {
		//this.numbers = numbers; with this method, when you modify the new Block, you modify the array used to construct it
		this.numbers = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			this.numbers[i] = numbers[i];
		}
		Arrays.sort(this.numbers);
	}
	
	@Override
	public String toString() {
		String s = "" + numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			s = s + ", " + numbers[i];
		}
		return s;
	}
	
	public int[] getNumbers() {
		int[] num = new int[numbers.length];
		for(int i = 0; i < num.length; i++) {
			num[i] = numbers[i];
		}
		return num;
	}
}
