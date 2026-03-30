import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(final String[] p_args) {
		final List<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add(1, "Grapes"); // Inserts at `((ArrayList) fruits)::elementData[1]`.

		// Access & iterate:
		System.out.println(fruits.get(0)); // `"Apple"`.
		for (final String f : fruits) {

			System.out.println(f);

		}

		// Remove:
		fruits.remove("Banana");
		System.out.println(fruits.size()); // `3`
	}

}