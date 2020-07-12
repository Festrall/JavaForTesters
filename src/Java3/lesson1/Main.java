package Java3.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] str1 = new String[3];

        str1[0] = "Hello";
        str1[1] = "World";
        str1[2] = "Son";

        System.out.println(Arrays.toString(str1));
        changePosition(str1);
        System.out.println(Arrays.deepToString(str1));

        ArrayList<String> arr = toArrayList(str1);
        System.out.println(arr);

    }
//1.Изменение позиции элемента в массиве
    public static void changePosition(Object[] objects) {
        for (int i = 0; i < objects.length - 1; i++) {
            Object temp = objects[i];
            objects[i] = objects[i + 1];
            objects[i + 1] = temp;
        }
    }

//2.Преобразование массива в ArrayList
    public static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }


}
