package homework.lesson6;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Коты   ]]к", "Двор", "Овчарка"),
                new Dog("Мясо", "Дом", "Лабрадор"),
                new Cat("Рыба", "Дом", true),
                new Cat("Мыши", "Улица", false),
                new Horse("Сено", "Конюшня", 69),
                new Horse("Овёс", "Ферма", 67)
        };

        Veterinarian vet = new Veterinarian();

        int dogCount = 0;
        int catCount = 0;
        int horseCount = 0;

        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];

            System.out.println("=== Животное №" + (i + 1) + " ===");

            animal.makeNoise();
            animal.eat();
            animal.sleep();

            vet.treatAnimal(animal);
            vet.examine(animal);

            System.out.println(animal);

            if (animal instanceof Dog) {
                dogCount++;
            } else if (animal instanceof Cat) {
                catCount++;
            } else if (animal instanceof Horse) {
                horseCount++;
            }

            System.out.println();
        }

        System.out.println("=== Итог ===");
        System.out.println("Собак: " + dogCount);
        System.out.println("Кошек: " + catCount);
        System.out.println("Лошадей: " + horseCount);
    }
}
