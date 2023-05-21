package Computer;

public class Computer {
    private String ComputerModel;
    private int ComputerPrice;
    private String ComputerRam;
    private String ComputerHdd;

    public Computer(String ComputerModel, int ComputerPrice){
        this.ComputerModel = ComputerModel;
        this.ComputerPrice = ComputerPrice;
        this.ComputerRam = "Default";
        this.ComputerHdd = "Default";
    }
    public Computer(String ComputerModel, int ComputerPrice, String ComputerRam, String ComputerHdd){
        this.ComputerModel = ComputerModel;
        this.ComputerPrice = ComputerPrice;
        this.ComputerRam = ComputerRam;
        this.ComputerHdd = ComputerHdd;
    }
    public void getInfoAboutComputer(){
        System.out.println("this is a computer specification :");
        System.out.println("Model :" + this.ComputerModel);
        System.out.println("Price :" + this.ComputerPrice);
        System.out.println("RAM :" + this.ComputerRam);
        System.out.println("HDD :" + this.ComputerHdd);
    }
}
