import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"a", "b", "c", "d"};
        Integer[] arr2 = {4, 5, 6, 21};

        System.out.println("Задача 1\n" + Arrays.toString(arr2));
        swapElements(arr2, 2, 3);
        System.out.println(Arrays.toString(arr2));

        List<String> list = convertToList(arr);
        System.out.println("Задача 2\n" + list.getClass() + " : " + list);

        System.out.println("Задача 3");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Apple> appleBox = new Box();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 5; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 8; i++) {
            appleBox.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        //получаем веса в коробках и выводим их
        float orangeBox1Weight = orangeBox1.getWeight();
        float orangeBox2Weight = orangeBox2.getWeight();
        float appleBoxWeight = appleBox.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orangeBox1Weight);
        System.out.println("Вес коробки 2 с апельсинами: " + orangeBox2Weight);
        System.out.println("Вес коробки с яблоками: " + appleBoxWeight);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    //меняет два элемента местами
    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
//конвертирует массив в ArrayList
//ArrayList - это гибкий массив, содержащий список объектов. Вы можете добавлять и удалять элементы из него, и он автоматически занимается распределением пространства.
//Массив (System.Array) фиксируется по размеру после его выделения. Вы не можете добавлять к нему элементы или удалять элементы из него. Кроме того, все элементы должны быть одного типа.

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
    }
