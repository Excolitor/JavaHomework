package homework.lesson8.genericRobots;

public enum BodyType {
    LIGHT("Light"),
    ARMORED("Armored"),
    HEAVY("Heavy");

    private final String title;

    BodyType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}