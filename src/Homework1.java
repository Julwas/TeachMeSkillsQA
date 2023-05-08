import java.util.Scanner;

public class Homework1 {
    static Scanner enter;

    public static void main(String[] args) {
        enter = new Scanner(System.in);

        getMyPersonalDate();
        System.out.println();
        charToInt();
        System.out.println();
        calculateBim();
        System.out.println();

        enter.close();
    }
    public static void getMyPersonalDate() {


        System.out.print("Please, enter your name :");
        String name = enter.nextLine();

        System.out.print("Please, enter your surname :");
        String surname = enter.nextLine();

        System.out.print("Please, enter your age :");
        int age = enter.nextInt();

        System.out.print("Please, enter your height :");
        int height = enter.nextInt();

        System.out.print("Please, enter your weight :");
        double weight = enter.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);

    }

    public static void charToInt() {

        char mySymbol = 'A';
        System.out.println("A -" + (int) mySymbol);
        char mySymbol1 = 'C';
        System.out.println("C -" + (int) mySymbol1);

    }

    public static void calculateBim() {

        System.out.print("Please, enter your Weight :");
        double Weight = enter.nextDouble();
        System.out.print("Please, enter your Height :");
        double Height = enter.nextDouble();
        double BMI = Weight / (Height * Height) * 10000 ;

        System.out.println("BMI is " + BMI + " kg/m2");

    }
}
