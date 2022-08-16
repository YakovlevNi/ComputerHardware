public class Memory {
    private final MemoryEnum type;
    private final int memVolume;
    private final double weight;

    public Memory(MemoryEnum type, int memVolume, double weight) {
        this.type = type;
        this.memVolume = memVolume;
        this.weight = weight;
    }

    public MemoryEnum getType() {
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
                "Тип накопителя: " + type + "\n" +
                "Объем памяти: " + memVolume + "\n" +
                "Вес: " + weight + "\n";
    }
}
