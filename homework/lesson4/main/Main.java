package homework.lesson4.main;

import homework.lesson4.cat.Cat;
import homework.lesson4.random.Randomizer;

public class Main {
    public static void main (String[] args) {

        int count = 0;
        while (count < 10) {
            Cat cat = new Cat();
           String name = cat.getName();
            int age = cat.getAge();
            int id = cat.getId();
            System.out.println("Имя кота: " + name + ", его возраст: " + age + ", ID: " + id);
            count++;
        }

        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cat.setName(Randomizer.generateCapitalCharacter(1) + Randomizer.generateLetterCharacter());
            cat.setAge(Randomizer.rndAge());
            String name = cat.getName();
            int age = cat.getAge();
            int id = cat.getId();
            System.out.println("Имя кота: " + name + ", его возраст: " + age + ", ID: " + id);
        }

        count = 0;
        do {
            Cat cat = new Cat();
            cat.setName(Randomizer.generateCapitalCharacter(1) + Randomizer.generateLetterCharacter());
            cat.setAge(Randomizer.rndAge());
            String name = cat.getName();
            int age = cat.getAge();
            int id = cat.getId();
            System.out.println("Имя кота: " + name + ", его возраст: " + age + ", ID: " + id);
            count++;
        } while (count < 10);

    }


}
