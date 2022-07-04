package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> listOne = Arrays.asList(10, 20, 30, 40, 41);
//		Stream<Integer> streamObject = listOne.stream();
//		
//
////		------------------------------------------
//		
//		List<String> teamNames = Arrays.asList("Team1", "Team2", "Team3", "Team4", "Team14");
//		teamNames.stream().forEach(x -> System.out.println(x));
//		
////		------------------------------------------
//		
//		    List<Integer> listTwo = 
//		    	listOne.stream()
//		            .map(x -> x*x)
//		            .collect(Collectors.toList());
//		    listTwo.stream().forEach(x -> System.out.println("squared is: " + x));
////			------------------------------------------		    
//		    
//		    List<String> result1 = 
//		    	teamNames.stream()
//		            .filter(str -> str.endsWith("4"))
//		            .collect(Collectors.toList());
//		    result1.stream().forEach(x -> System.out.println(x));
////			------------------------------------------
//		    
//		    List<String> result2 = 
//		        teamNames.stream()
//		            .sorted()
//		            .collect(Collectors.toList());
//		    result2.stream().forEach(x -> System.out.println(x));
////			------------------------------------------		
//		    
//		    int even = 
//		        listOne.stream()
//		            .filter(x -> x % 2 == 0)
//		            .reduce((a,b) -> a+b)
//		            .get();
//		    System.out.println(even);
//
////			------------------------------------------
//		
//		List<String> teamNames = new ArrayList<String>();
//		
//		teamNames.add("RedBull");
//		teamNames.add("McLaren");
//		teamNames.add("Ferrari");
//		teamNames.add("Mercedes");
//		teamNames.add("AlphaTauri");
//		
//		long countMoreThanSeven = teamNames.stream().filter(str -> str.length() > 7).count();
//		System.out.println(countMoreThanSeven + "with more than 7 chars in name.");
//		
//		List<String> mTeamNames = teamNames.stream()
//				.filter(str -> str.startsWith("M"))
//				.collect(Collectors.toList());
//		
//		System.out.println("Names starting with M:");
//		mTeamNames.forEach(n -> System.out.println(n));
//		
//		List <String> sortedTeamNames = teamNames.stream()
//				.sorted()
//				.collect(Collectors.toList());
//		
//		System.out.println("List after sorting: ");
//		sortedTeamNames.forEach(n -> System.out.println(n));
//
//			------------------------------------------------
		
		List<String> names = new ArrayList<String>();
		
		names.add("Michael");
		names.add("Dean");
		names.add("James");
		names.add("Chris");
		
		List<String> hello = 
				names.stream()
					.filter(n -> !n.equals("James"))
					.collect(Collectors.toList());
		
		hello.forEach(n -> System.out.println("Hello "+ n));
		
//		List<Integer> numbers = new ArrayList<Integer>();
//		
//		numbers.add(3);
//		numbers.add(4);
//		numbers.add(7);
//		numbers.add(8);
//		numbers.add(12);
		
		List<Integer> numbers = Arrays.asList(3,4,7,12,8);
		
		int numbersProduct = numbers.stream()
				.reduce((a,b) -> a*b).get();
		
		System.out.println("Product of numbers: " + numbersProduct);
		
		
		List<Integer> numbersOrdered = numbers.stream()
				.sorted()
				.collect(Collectors.toList());
		
		int numbersMax = numbersOrdered.get(numbersOrdered.size()-1);
		System.out.println("Max number: " + numbersMax);
		
		int numbersMin = numbersOrdered.get(0);
		System.out.println("Min number: " + numbersMin);
		
	    List<Integer> odd = 
	            numbers.stream()
	                .filter(x -> x % 2 != 0)
	                .collect(Collectors.toList());
		
	    System.out.println("Odd numbers: " + odd);
	    System.out.println("Odd numbers also below:");
	    odd.forEach(n -> System.out.println(n));
	    
	    
	    List<Integer> even = 
	            numbers.stream()
	                .filter(x -> x % 2 == 0)
	                .collect(Collectors.toList());
		
	    System.out.println("Even numbers: " + even);
	    System.out.println("Even numbers also below:");
	    even.forEach(n -> System.out.println(n));
		
		int numbersSum = numbers.stream()
				.reduce((a,b) -> a+b).get();
		
		System.out.println("Sum of numbers: "+ numbersSum);
		
		List<Integer> minEvenSquaredList =
				numbers.stream()
					.map(x -> x*x)
					.filter(x -> x % 2 == 0)
					.sorted()
					.collect(Collectors.toList());
		
		System.out.println("Min even squared number: " + minEvenSquaredList.get(0));
		    
	}
}
