package homework.lesson4.cat;

import homework.lesson4.random.Randomizer;

import java.util.Objects;

public class Cat {

    public Cat() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
    }

    private static final int defAge = 2;
    private String name;
    private int age;
    private int id;

//    Randomizer randomizer = new Randomizer();

    public static void main (String[] args) {
        Cat cat = new Cat();
        cat.setName(Randomizer.generateCapitalCharacter(1) + Randomizer.generateLetterCharacter(5));
        cat.setAge(Randomizer.rndAge(5));
        System.out.println(cat.name);
        System.out.println(cat.age);
    }

}
