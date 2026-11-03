package homework.lesson8.genericRobots;

public enum HeadType {
    ANDROID("Роботизированная"),
    HUMAN("Человеческая"),
    HYBRID("Гибрид");

    private final String title;

    HeadType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}