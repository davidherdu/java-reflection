package codingExercise9;

import java.lang.annotation.*;

public class Annotations {

	@Target(ElementType.TYPE)
	@Repeatable(PermissionsContainer.class)
	public @interface Permissions {
		Role role();

		OperationType[] allowed();
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.TYPE)
	public @interface PermissionsContainer {
		Permissions[] value();
	}
}
