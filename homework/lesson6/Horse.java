package homework.lesson6;

public class Horse extends Animal {

    private int maxSpeed;

    public Horse(String food, String location, int maxSpeed) {
        super(food, location);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржёт: И-го-го!");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест " + getFood());
    }

    @Override
    public String toString() {
        return "Horse [food = " + getFood() +
                ", location = " + getLocation() +
                ", maxSpeed = " + maxSpeed + "]";
    }
}
