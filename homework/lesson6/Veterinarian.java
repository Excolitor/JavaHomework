package homework.lesson6;


public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("На приёме: food = " + animal.getFood() + ", location = " + animal.getLocation());
    }

    public void examine(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("Порода = " + dog.getBreed());
        }
        else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            if (cat.isIndoor()) {
                System.out.println("Кошка домашняя");
            }
            else {
                System.out.println("Кошка уличная");
            }
        }
        else if (animal instanceof Horse) {
            Horse horse = (Horse) animal;
            System.out.println("Максимальная скорость " + horse.getMaxSpeed());
        }
    }
}
