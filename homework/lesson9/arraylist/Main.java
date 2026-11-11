package homework.lesson9.arraylist;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyList<String> list = new MyArrayList<>();

        System.out.println("Пустой список: " + list);
        System.out.println("isEmpty(): " + list.isEmpty());

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("\nПосле add(): " + list);
        System.out.println("size(): " + list.size());

        list.add(1, "Mango");

        System.out.println("\nПосле add(1, Mango): " + list);

        System.out.println("get(2): " + list.get(2));

        System.out.println("contains(Banana): " + list.contains("Banana"));
        System.out.println("contains(Pear): " + list.contains("Pear"));

        System.out.println("indexOf(Orange): " + list.indexOf("Orange"));
        System.out.println("indexOf(Pear): " + list.indexOf("Pear"));

        System.out.println("\nset(0, Kiwi): старое значение = "
                + list.set(0, "Kiwi"));

        System.out.println("После set(): " + list);

        System.out.println("\nremove(Banana): " + list.remove("Banana"));
        System.out.println("После remove(Object): " + list);

        System.out.println("remove(1): удалён = " + list.remove(1));
        System.out.println("После remove(index): " + list);

        List<String> anotherList = Arrays.asList(
                "Peach",
                "Cherry",
                "Grape"
        );

        System.out.println("\naddAll(): " + list.addAll(anotherList));
        System.out.println("После addAll(): " + list);

        MyArrayList<String> copiedList = new MyArrayList<>(list);

        System.out.println("\nКопия списка: " + copiedList);

        MyArrayList<Integer> numbers = new MyArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nСписок Integer: " + numbers);
    }
}