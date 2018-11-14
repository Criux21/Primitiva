
public class Ticket {
	private Block[] blocks;
	
	public Ticket(int num) {
		blocks = new Block[num];
		for(int i = 0; i < blocks.length;i++) {
			blocks[i] = new Block(6);
		}
	}
	
	public String toString() {
		String s = "" + blocks[0];
		for(int i = 1; i < blocks.length; i++) {
			s = s + "\n" + blocks[i];
		}
		return s;
	}
	
	public String printUsedNumbers() {
		boolean[] numbers = new boolean[50];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = false;
		}
		String s = "";
		for(int i = 0; i < blocks.length; i++) {
			int[] b = blocks[i].getNumbers();
			for (int j = 0; j < 6; j++) {
				int num = b[j];
				
				if(numbers[num] == false) {
					numbers[num] = true;
				}
			}
		}
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] == true) {
				s += ", " + i;
			}
		}
		s = s.replaceFirst(", ", "");
		return s;
	}
}
