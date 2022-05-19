package ArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {
    public static <T> T[] create(int length, T def) {

        T[] arr = ((T[]) Array.newInstance(def.getClass(), length));

        Arrays.fill(arr, def);

        return arr;

    }

    public static <T> T[] create(Class<T> clazz, int length, T def) {
        Object newInstance = Array.newInstance(clazz, length);
        T[] arr = ((T[]) newInstance);

        Arrays.fill(arr, def);

        return arr;

    }
}
