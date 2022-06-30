package inputOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		Person devin = new Person("Devin", 25, "Tech Specialist");
		
		System.out.println(devin);
		
		Person cam = new Person("Cameron", 23, "Tech Specialist");
		Person shak = new Person("Shakir", 22, "Tech Specialist");
		Person adi = new Person("Aditya", 29, "Tech Specialist");
		
//		List<Person> listPerson = Arrays.asList(devin, cam, shak, adi);
		List<Person> listPerson = new ArrayList<>();
		
		listPerson.add(devin);
		listPerson.add(cam);
		listPerson.add(shak);
		listPerson.add(adi);
		
		System.out.println(listPerson);
		
		
	}
}
