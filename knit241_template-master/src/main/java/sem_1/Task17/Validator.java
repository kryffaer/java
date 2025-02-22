package sem_1.Task17;

import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            // Разрешаем доступ к private переменным
            field.setAccessible(true);
            Object value = field.get(obj);

            // Проверка @NotNull
            if (field.isAnnotationPresent(NotNull.class) && value == null) {
                System.out.println("Поле " + field.getName() + " не должно быть null.");
            }

            // Проверка @MaxLength
            if (field.isAnnotationPresent(MaxLength.class)) {
                int maxLength = field.getAnnotation(MaxLength.class).value();
                if (value instanceof String && ((String) value).length() > maxLength) {
                    System.out.println("Поле " + field.getName() + " превышает максимальную длину " + maxLength + ".");
                }
            }

            // Проверка @Min
            if (field.isAnnotationPresent(Min.class)) {
                int minValue = field.getAnnotation(Min.class).value();
                if (value instanceof Integer && ((Integer) value) < minValue) {
                    System.out.println("Поле " + field.getName() + " должно быть не меньше " + minValue + ".");
                }
            }
        }
    }
}
