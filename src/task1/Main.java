package task1;

/**
 * Напишите метод filter, который принимает на вход массив любого типа, вторым арументом метод должен принимать клас,
 * реализующий интерфейс task1.Filter, в котором один метод - Object apply(Object o).
 * Метод должен быть реализован так чтобы возращать новый масив, к каждому элементу которого была применена функция apply
 */
public class Main {
	public static void main(String[] args) {
		// Пример с массивом целых чисел
		Integer[] numbers = {1, 2, 3, 4, 5};

		// Фильтр, который умножает каждое число на 2
		Filter multiplyByTwo = o -> ((Integer) o) * 2;

		Object[] result = CollectionFilter.filter(numbers, multiplyByTwo);

		// Вывод результата
		System.out.println("Original array:");
		for (Integer num : numbers) {
			System.out.print(num + " ");
		}

		System.out.println("\nFiltered array:");
		for (Object num : result) {
			System.out.print(num + " ");
		}

		// Пример с массивом строк
		String[] words = {"hello", "world", "java"};

		// Фильтр, который преобразует строки в верхний регистр
		Filter toUpperCase = o -> ((String) o).toUpperCase();

		Object[] upperResult = CollectionFilter.filter(words, toUpperCase);

		System.out.println("\n\nOriginal strings:");
		for (String word : words) {
			System.out.print(word + " ");
		}

		System.out.println("\nFiltered strings:");
		for (Object word : upperResult) {
			System.out.print(word + " ");
		}
	}
}