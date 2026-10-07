package homework.lesson3.rainbow;

public class Rainbow {

    public static final int RED = 1;
    public static final int ORANGE = 2;
    public static final int YELLOW = 3;
    public static final int GREEN = 4;
    public static final int BLUE = 5;
    public static final int DARKBLUE = 6;
    public static final int PURPLE = 7;

    public static final int RED_ORANGE = 101;
    public static final int ORANGE_YELLOW = 102;
    public static final int YELLOW_GREEN = 103;
    public static final int GREEN_BLUE = 104;
    public static final int BLUE_DARKBLUE = 105;
    public static final int DARKBLUE_PURPLE = 106;

    public static final int FIRST_MIXED_COLOR = 101;
    public static final int LAST_MIXED_COLOR = 106;

    public String getColorName(int number) {
        if (number >= RED && number <= PURPLE) {
            switch (number) {
                case RED:
                    return "Красный";
                case ORANGE:
                    return "Оранжевый";
                case YELLOW:
                    return "Желтый";
                case GREEN:
                    return "Зеленый";
                case BLUE:
                    return "Голубой";
                case DARKBLUE:
                    return "Синий";
                case PURPLE:
                    return "Фиолетовый";
            }
        }
        return "Цвет c номером: " + number + " не найден";
    }
    public String getMixedColor (int number) {
        if (number >= FIRST_MIXED_COLOR && number <= LAST_MIXED_COLOR) {
            switch (number) {
                case RED_ORANGE:
                    return "Красно-Оранжевый";
                case ORANGE_YELLOW:
                    return "Оранжево-Желтый";
                case YELLOW_GREEN:
                    return "Желто-Зеленый";
                case GREEN_BLUE:
                    return "Зелено-Голубой";
                case BLUE_DARKBLUE:
                    return "Голубо-Синий";
                case DARKBLUE_PURPLE:
                    return "Сине-Фиолетовый";
            }
        }
        return "У фиолетового нету пары";
    }

    public  void incorrectNumber (int number) {
        if (number > 7) {
            System.out.println("Цвет c номером: " + number + " не найден");
            System.exit(0);
        }

    }
}
