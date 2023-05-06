import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {


        ScannerMyParameters();
        System.out.println();

        CharToInt();
        System.out.println();

        calculateBim();
    }

        public static void ScannerMyParameters() {

            Scanner enter = new Scanner(System.in);
            System.out.print("Please, enter your name :");
            String name = enter.nextLine();

            System.out.print("Please, enter your surname :");
            String surname = enter.nextLine();

            System.out.print("Please, enter your age :");
            String age = enter.nextLine();

            System.out.print("Please, enter your height :");
            String height = enter.nextLine();

            System.out.print("Please, enter your weight :");
            String weight = enter.nextLine();

            System.out.println("Name: " + name);
            System.out.println("Sureame: " + surname);
            System.out.println("Age: " + age);
            System.out.println("Haight: " + height);
            System.out.println("Weight: " + weight);

            enter.close();
        }
        public static void CharToInt(){

            char mySymbol ='A';
            System.out.println("A -" + (int)mySymbol);
            char mySymbol1 ='C';
            System.out.println("C -" + (int)mySymbol1);

        }

    public static void calculateBim(){

        Scanner bim = new Scanner(System.in);
        System.out.print("Please, enter your Weight :");
        double Weight= bim.nextDouble();
        System.out.print("Please, enter your Height :");
        double Height = bim.nextDouble();
        double BMI = Weight / (Height*Height);

        System.out.println("BMI is " + BMI + " kg/m2");

        bim.close();

    }

        }
