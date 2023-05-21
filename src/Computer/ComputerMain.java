package Computer;

public class ComputerMain {
    public static void main(String[] args){
        Computer computer1 = new Computer("APPLE MacBooK Air", 4500);
        Computer computer2 = new Computer("DELL Inspirion", 4050,
                "16 GB", "512 GB");

        computer1.getInfoAboutComputer();
        System.out.println();
        computer2.getInfoAboutComputer();
    }
}
