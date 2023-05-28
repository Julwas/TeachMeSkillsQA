package Phone;

public class Phone {
    private String number;
    private String model;
    private double weight;
    public Phone(String number, String model, double weight){
        this.model = model;
        this.number = number;
        this.weight = weight;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getInfo() {
        System.out.println("The phone number is : " + getNumber() + "\n"
                        + "The model is : " + this.model + "\n"
                + "The weight is : " + this.weight);
        return null;
    }
    public String receiveCall(String name){
        System.out.println(name + "  is calling");
        return null;
    }
    public String receiveCall(String name, String number)
    {
        System.out.println(name + "is calling  " + number);
        return null;
    }
    public String getINFO() {
        System.out.println("The phone number is : " + getNumber() + "\n"
                + "The model is : " + this.model);
        return null;}

    public void sendMessage(String ... numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Send message to number " + numbers[i]);
    }
}
}
