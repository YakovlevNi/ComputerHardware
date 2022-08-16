public final class Om {
    private final OperMem type;
    private final int memVolume;
    private final double weight;


    public Om(OperMem type, int memVolume, double weight) {
        this.type = type;
        this.memVolume = memVolume;
        this.weight = weight;
    }

    public OperMem getType() {
        return type;
    }

    public int getMemVolume() {
        return memVolume;
    }

    public double getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "\n" +
                "Тип: " + type + "\n" +
                "Объем памяти: " + memVolume + "\n" +
                "Вес: " + weight + "\n";
    }
}
