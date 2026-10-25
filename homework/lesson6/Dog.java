package homework.lesson6;

public class Dog extends Animal {

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    private String breed;



    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает: гав гав !");
    }

    @Override
    public void eat() {
        System.out.println("Cобака ест " + getFood());
    }

    @Override
    public String toString() {
        return "Dog [food = " + getFood() +
                ", location = " + getLocation() +
                ", breed = " + breed + "]";
    }
}
