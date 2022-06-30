package Generics;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericTemplate<Integer> test = new GenericTemplate<Integer>();
		
		test.setTestVariable(101);
		
		System.out.println(test.getTestVariable());
		
//		-------------------------------		
		
		GenericTemplate<String> testTwo = new GenericTemplate<String>();
		
		testTwo.setTestVariable("String type");
		
		System.out.println(testTwo.getTestVariable());
	}

}
