package Stream;

import java.util.List;

public record Developer(String name, List<String> languages) {
	
	public void talk() {
		System.out.println("Hello, now I'm coding.");
	}
}