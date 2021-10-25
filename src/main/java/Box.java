import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

//Упорядоченная коллекция (также известная как последовательность).
// Пользователь этого интерфейса имеет точный контроль над тем, где в списке будет вставлен каждый элемент.
// Пользователь может получить доступ к элементам по их целочисленному индексу (позиции в списке) и искать элементы в списке.
    public List<T> getList() {
        return list;
    }

    private final List<T> list;

    public Box(T... object) {
        list = Arrays.asList(object);
    }

    public Box() {
        list = new ArrayList<>();
    }

    //создаем объект в списке
    void add(T object) {
        list.add(object);
    }

    void moveAt(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }

    //информация, что находится в коробках
    void info() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке находятся " + list.get(0).toString() + " в количестве: " + list.size());
        }
    }

    //получаем вес и возвращаем его целиком
    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }
    //сравниваем вес двух коробок и в результате выводим true или false
    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }
}
