package codingExercise4;

import java.lang.reflect.*;

public class ArrayReader {

	public Object getArrayElement(Object array, int index) {
		if (index >= 0) {
			return Array.get(array, index);
		}
		int arrayLength = Array.getLength(array);
		return Array.get(array, arrayLength + index);
	}
}
