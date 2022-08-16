public class Main {
    public static void main(String[] args) {
        Processor myProcessor = new Processor(CpuEnum.AMD, 0.25, 8, 4200);
        Om myOm = new Om(OperMem.DDR4, 2300, 0.76);
        Memory myMemory = new Memory(MemoryEnum.HDD, 500, 1.23);
        Keyboard myKeyboard = new Keyboard(KeyboardEnum.Membrane, true, 0.36);
        Screen myScreen = new Screen(27, ScreenEnum.IPS, 6.365);
        Computer computer = new Computer("HyperPc", "Home Station", myKeyboard, myMemory, myOm, myProcessor, myScreen);
        System.out.println(computer.toString());


    }
}
