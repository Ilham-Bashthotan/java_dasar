package util;

import java.lang.reflect.Field;

import annotation.NotBlank;
import error.BlankException;

public class ValidationUtil {
    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field :  fields) {
            field.setAccessible(true);
            if (field.getAnnotation(NotBlank.class) != null) {
                // validated
                try {
                    String value =(String) field.get(object);
                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak dapat mengakses field: " + field.getName());
                }
            }
        }
    }
}
