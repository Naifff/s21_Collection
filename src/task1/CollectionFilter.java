package task1;

public class CollectionFilter {
	public static Object[] filter(Object[] array, Filter filter) {
		if (array == null || filter == null) {
			throw new IllegalArgumentException("Array and filter cannot be null");
		}

		// Создаем новый массив той же длины
		Object[] result = new Object[array.length];

		// Применяем фильтр к каждому элементу
		for (int i = 0; i < array.length; i++) {
			result[i] = filter.apply(array[i]);
		}

		return result;
	}
}