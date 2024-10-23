package codingExercise8;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

public class Exercise {

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	public @interface OpenResources {
	}

	public Set<Method> getAllAnnotatedMethods(Object input) {
		Set<Method> annotatedMethods = new HashSet<>();

		for (Method method : input.getClass().getDeclaredMethods()) {
			if (method.isAnnotationPresent(OpenResources.class)) {
				annotatedMethods.add(method);
			}
		}

		return annotatedMethods;
	}
}
