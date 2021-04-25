class CPU {
    public int  processData() {
        System.out.println("Procesare date");
        return 20;
    }
}

class Memory {
    public long load() {
        System.out.println("Încărcare date");
        return 35L;
    }
}

class HardDrive {
    public long readdata(int a, long b) {
        System.out.println("Citire date");
        return a+b;
    }
}

/* Facade */
class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void run() {
        System.out.println("Rulare="+hardDrive.readdata( cpu.processData(),memory.load() ));

    }
}

class Facade {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.run();
    }
}