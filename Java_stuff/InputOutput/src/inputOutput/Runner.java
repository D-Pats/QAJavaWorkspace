package inputOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {

		Person devin = new Person("Devin", 25, "Tech Specialist");

		System.out.println(devin);

		Person cam = new Person("Cameron", 24, "Tech Specialist");
		Person shak = new Person("Shakir", 23, "Tech Specialist");
		Person adi = new Person("Aditya", 29, "Tech Specialist");
		Person fifth = new Person("Five", 99, "Not Real Person");

//		List<Person> listPerson = Arrays.asList(devin, cam, shak, adi);
		List<Person> listPerson = new ArrayList<>();

		listPerson.add(devin);
		listPerson.add(cam);
		listPerson.add(shak);
		listPerson.add(adi);
		listPerson.add(fifth);

//		Loops through each person and prints		
//		listPerson.stream()
//			.forEach(n -> System.out.println(n));

		String nameOfPerson = "Shakir";

		List<Person> findSpecific = listPerson.stream().filter(n -> n.getName().equals(nameOfPerson))
				.collect(Collectors.toList());

		System.out.println(findSpecific);

		listPerson.stream().forEach(n -> IOmethods.writeFile(n.toString()));
		
		IOmethods.readFile();
	
	}
}
