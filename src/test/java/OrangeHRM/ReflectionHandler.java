package OrangeHRM;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionHandler {
    private ReflectionHandler() {
    }

    public static Object getFieldValueUsingEnumName(Object object, Enum option) throws Exception {
        Class<?> enclosingClass = object.getClass();
        String enumName = option.name();
        if (enclosingClass == null) {
            throw new Exception();
        } else {
            try {
                String methodName = "get" + (String) Arrays.stream(enumName.split("_")).map((t) -> {
                    return t.substring(0, 1) + t.substring(1).toLowerCase();
                }).reduce((t1, t2) -> {
                    return t1 + t2;
                }).get();
                Method method = enclosingClass.getMethod(methodName);
                return method.invoke(object);
            } catch (Exception var6) {
                throw new Exception();
            }
        }
    }
}
