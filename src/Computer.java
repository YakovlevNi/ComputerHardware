public class Computer {

    private final String vendor;
    private final String name;

    public Computer(String vendor, String name, Keyboard key, Memory memory, Om operMem, Processor cpu, Screen display) {
        this.vendor = vendor;
        this.name = name;
        this.key = key;
        this.memory = memory;
        this.operMem = operMem;
        this.cpu = cpu;
        this.display = display;


    }

    Keyboard key;
    Memory memory;
    Om operMem;
    Processor cpu;
    Screen display;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;

    }

    public Keyboard getKey() {
        return key;
    }

    public void setKey(Keyboard key) {
        this.key = key;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Om getOperMem() {
        return operMem;
    }

    public void setOperMem(Om operMem) {
        this.operMem = operMem;
    }

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public Screen getDisplay() {
        return display;
    }

    public void setDisplay(Screen display) {
        this.display = display;
    }

    public double getTotalWeight() {
        double totalWeight = cpu.getCpuWeight() + key.getWeight() + memory.getWeight() + operMem.getWeight() + display.getWeight();

        return totalWeight;
    }


    @Override
    public String toString() {
        return
                "Производитель: " + vendor + "\n" +
                        "Модель: " + name + "\n" +
                        "Клавиатура: " + key + "\n" +
                        "Память устройства: " + memory + "\n" +
                        "Оперативная память: " + operMem + "\n" +
                        "Процессор: " + cpu + "\n" +
                        "Монитор: " + display + "\n" + "\n" +
                        "Общий вес ПК: " + getTotalWeight() + " кг";
    }
}
