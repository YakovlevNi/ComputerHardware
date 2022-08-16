public class Screen {

    private final int screenInch;
    private final ScreenEnum type;
    private final double weight;

    public Screen(int screenInch, ScreenEnum type, double weight) {
        this.screenInch = screenInch;
        this.type = type;
        this.weight = weight;
    }

    public int getScreenInch() {
        return screenInch;
    }

    public ScreenEnum getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "\n" +
                "Дигональ: " + screenInch + "\n" +
                "Матрица: " + type + "\n" +
                "Вес: " + weight;
    }
}
