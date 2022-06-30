package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listOne = Arrays.asList(10, 20, 30, 40, 41);
		Stream<Integer> streamObject = listOne.stream();
		

//		------------------------------------------
		
		List<String> teamNames = Arrays.asList("Team1", "Team2", "Team3", "Team4", "Team14");
		teamNames.stream().forEach(x -> System.out.println(x));
		
//		------------------------------------------
		
		    List<Integer> listTwo = 
		    	listOne.stream()
		            .map(x -> x*x)
		            .collect(Collectors.toList());
		    listTwo.stream().forEach(x -> System.out.println("squared is: " + x));
//			------------------------------------------		    
		    
		    List<String> result1 = 
		    	teamNames.stream()
		            .filter(str -> str.endsWith("4"))
		            .collect(Collectors.toList());
		    result1.stream().forEach(x -> System.out.println(x));
//			------------------------------------------
		    
		    List<String> result2 = 
		        teamNames.stream()
		            .sorted()
		            .collect(Collectors.toList());
		    result2.stream().forEach(x -> System.out.println(x));
//			------------------------------------------		
		    
		    int even = 
		        listOne.stream()
		            .filter(x -> x % 2 == 0)
		            .reduce((a,b) -> a+b)
		            .get();
		    System.out.println(even);
		    
	}
}
