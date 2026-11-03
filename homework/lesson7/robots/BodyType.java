package homework.lesson7.robots;

public enum BodyType {
    LIGHT("Лёгкое"),
    ARMORED("Бронированное"),
    HEAVY("Тяжёлое");
    private final String title;

    BodyType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    /////
}