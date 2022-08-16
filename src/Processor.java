public class Processor {

    private final CpuEnum cpuName;
    public final double cpuWeight;
    private final int cpuCores;
    private final int cpuFrquency;

    public Processor(CpuEnum cpuName, double cpuWeight, int cpuCores, int cpuFrquency) {
        this.cpuName = cpuName;
        this.cpuWeight = cpuWeight;
        this.cpuCores = cpuCores;
        this.cpuFrquency = cpuFrquency;
    }


    public CpuEnum getCpuName() {
        return cpuName;
    }

    public double getCpuWeight() {
        return cpuWeight;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public int getCpuFrquency() {
        return cpuFrquency;
    }


    @Override
    public String toString() {
        return "\n" +
                "Производитель: " + cpuName + "\n" +
                "Вес: " + cpuWeight + "\n" +
                "Кол-во ядер: " + cpuCores + "\n" +
                "Тактовая частота: " + cpuFrquency + "\n";
    }
}
