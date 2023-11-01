package a7_String.regulr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String[] args) {
		// Example regular expression pattern
		String regex = "b..n";
		String input = "b!u@n#n$y";

		// Remove special characters from input
		input = input.replaceAll("[^a-zA-Z0-9]", "");

		// Creating a Pattern object
		Pattern pattern = Pattern.compile(regex);

		// Creating a Matcher object
		Matcher matcher = pattern.matcher(input);

		// Using find() method
		if (matcher.find()) {
			System.out.println("Pattern found in the input string.");
		} else {
			System.out.println("Pattern not found in the input string.");
		}

		// Using matches() method
		if (matcher.matches()) {
			System.out.println("Input string completely matches the pattern.");
		} else {
			System.out.println("Input string does not completely match the pattern.");
		}

		// Using group() method
		while (matcher.find()) {
			System.out.println("Found: " + matcher.group());
		}

		// Using replaceAll() method
		String replacedString = matcher.replaceAll("giraffe");
		System.out.println("Replaced string: " + replacedString);

		// Using split() method
		String text = "apple, banana, orange, peach";
		String[] result = text.split("\\s*,\\s*");
		for (String fruit : result) {
			System.out.println("Fruit: " + fruit);
		}
	}
}
