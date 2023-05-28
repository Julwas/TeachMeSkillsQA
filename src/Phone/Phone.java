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


    public String getNomber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getInfo() {
        System.out.println("The phone number is : " + getNomber() + "\n"
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

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
