public class Keyboard {

    private final KeyboardEnum type;
    private final boolean lightning;
    private final double weight;

    public Keyboard(KeyboardEnum type, boolean lightning, double weight) {
        this.type = type;
        this.lightning = lightning;
        this.weight = weight;
    }

    public KeyboardEnum getType() {
        return type;
    }

    public boolean isLightning() {
        return lightning;
    }

    public double getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "\n" +
                "Тип клавиатуры: " + type + "\n" +
                "Подсветка: " + lightning + "\n" +
                "Вес: " + weight + "\n";
    }
}
