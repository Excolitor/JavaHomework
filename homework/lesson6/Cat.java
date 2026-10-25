package homework.lesson6;

public class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String food, String location, boolean isIndoor) {
        super(food, location);
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает: Мяу!");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест " + getFood());
    }

    @Override
    public String toString() {
        return "Cat [food = " + getFood() +
                ", location = " + getLocation() +
                ", isIndoor = " + isIndoor + "]";
    }
}
