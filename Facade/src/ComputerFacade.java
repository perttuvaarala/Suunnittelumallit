
public class ComputerFacade {
	
    private CPU cpu;
    private Memory ram;
    private HardDrive hdd;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.ram = new Memory();
        this.hdd = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        ram.load(10, hdd.read(3, 7));
        cpu.jump(5);
        cpu.execute();
    }

}
