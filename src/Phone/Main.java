package Phone;

public class Main {
    public static void main(String[] args){
       Phone phone1 = new Phone( "576-744-958", "Iphone 13", 180);
       Phone phone2 = new Phone( "123-456-789", "Samsung GALAXY S21", 157);
       Phone phone3 = new Phone( "576-729-949", "NOKIA 7", 164);

        phone1.getInfo();
        System.out.println();
        phone2.getInfo();
        System.out.println();
        phone3.getInfo();
        System.out.println();

        phone1.receiveCall("Mariusz");
        phone1.receiveCall("Mariusz", "724-931-354");
        System.out.println();
        phone2.receiveCall("Alexandr");
        phone2.receiveCall("Alexandr", "821-247-328");
        System.out.println();
        phone3.receiveCall("Marta");
        phone3.receiveCall("Marta", "821-247-328");
        System.out.println();

        phone1.getINFO();
        System.out.println();
        phone2.getINFO();
        System.out.println();
        phone3.getINFO();
        System.out.println();

        phone1.sendMessage("254-869-600", "127-584-877", "900-124-500");
    }
}
