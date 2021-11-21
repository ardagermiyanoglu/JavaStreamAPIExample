package Stream;

import java.util.List;

public class Stream {

	public static void main(String[] args) {

		List<Developer> developers = List.of(new Developer("Dan", List.of("Java", "JavaScript", "TypeScript", "C#")),
				new Developer("Joe", List.of("Java", "TypeScript", "C#")),
				new Developer("Andrew", List.of("TypeScript", "C#")));

		List<Developer> java = developers.stream().filter(developer -> developer.languages().contains("Java")).toList();
		System.out.println(java);
		
		developers.stream().forEach(Developer::talk);
	}
}
