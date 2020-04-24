public class MainDriver {

	private static final int NUMBER_OF_STACKS = 3;
	private static final int DEFAULT_SIZE = 3;
	
	public static void main(String[] args) throws Exception {
		MultiStack multiStack = new MultiStack(NUMBER_OF_STACKS, DEFAULT_SIZE); 
		
		multiStack.push(0, 4);
		multiStack.push(1, 89);
		multiStack.push(2, 12);
		multiStack.push(2, 11);
		
		multiStack.push(1, 7);
		multiStack.push(1, 45);
		multiStack.push(1, 18);
		multiStack.push(1, 9);
		
	}
	
}
