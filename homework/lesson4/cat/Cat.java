package homework.lesson4.cat;
import java.util.Objects;

public class Cat {

    public Cat() {
        this(defName, defAge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private static final String defName = "Кишка";
    private static final int defAge = 2;
    private final int id;
    private static int counter = 0;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++counter;
    }

    private String name;
    private int age;

    public int getId() {
        return id;
    }

}
