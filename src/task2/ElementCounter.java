package task2; /**
 * Напишите метод, который получает на вход массив элементов и возвращает Map ключи в котором - элементы, а значения -
 * сколько раз встретился этот элемент
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class ElementCounter {
	public static <T> Map<T, Integer> countElements(T[] array) {
		Map<T, Integer> elementCount = new HashMap<>();

		for (T element : array) {
			elementCount.merge(element, 1, Integer::sum);
		}

		return elementCount;
	}

	// Example usage
	public static void main(String[] args) {
		// Example with String array
		String[] strings = {"apple", "banana", "apple", "cherry", "banana", "apple"};
		Map<String, Integer> stringCounts = countElements(strings);
		System.out.println(Arrays.asList(strings));
		System.out.println("String counts: " + stringCounts);

		// Example with Integer array
		Integer[] numbers = {1, 2, 3, 2, 4, 1, 5, 2};
		Map<Integer, Integer> numberCounts = countElements(numbers);
		System.out.println(Arrays.asList(numbers));
		System.out.println("Number counts: " + numberCounts);
	}
}