package lambdaExpressions;

import java.util.ArrayList;


	public class Runner {
		
		interface FuncInterface {
			int operation(int a, int b);}

		private int operate(int a, int b, FuncInterface funcObj) {
		    return funcObj.operation(a, b);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ArrayList<Integer> listOne = new ArrayList<>();

			listOne.add(2);
			listOne.add(45);
			listOne.add(23);
			listOne.add(80);

			listOne.forEach(n -> {
				if (n > 25)
					System.out.println(n + " is larger than my age");
				else
					System.out.println(n + " is equal to or smaller than my age");
			});

//		listOne.forEach(n -> {(n <= 25) ? System.out.println(n + " is larger than my age") : System.out.println(n + " is equal to or smaller than my age")});
//		-----------------------------------------
			
			FuncInterface multiply = (int x, int y) -> x * y;

			Runner test = new Runner();
			System.out.println(test.operate(listOne.get(0), listOne.get(2), multiply));

		}

}
