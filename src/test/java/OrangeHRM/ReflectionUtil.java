package OrangeHRM;

import org.testng.Assert;

import java.util.List;

public class ReflectionUtil {
    private ReflectionUtil() {
    }

    public static <T extends Enum<?>> void verifyUIValue(Object reference, List<String> uiValues, T columnIdentifier) throws Exception {
        String uiValue = uiValues.get(columnIdentifier.ordinal()).replace(",", "");
        String fieldValue = String.valueOf(ReflectionHandler.getFieldValueUsingEnumName(reference, columnIdentifier));
        Assert.assertEquals(uiValue, fieldValue.trim(), String.format("UI table cell '%s' verification failed", columnIdentifier));

    }
}