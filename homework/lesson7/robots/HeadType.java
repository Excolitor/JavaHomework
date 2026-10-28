package homework.lesson7.robots;

public enum HeadType {
    ANDROID("Механизированная"),
    HUMAN("Человеческая"),
    HYBRID("Гибридная");
    private final String title;

    HeadType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    /////
}