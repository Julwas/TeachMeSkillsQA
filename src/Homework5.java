import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {
    static Scanner mas;

    public static void main(String[] args) {
        mas = new Scanner(System.in);

        numberIncluded();
        System.out.println();

       // deleteArrayElements();
        System.out.println();

        //arrayRandom();
        System.out.println();

        //compareArrays();

        mas.close();
    }


    public static void numberIncluded() {

        System.out.println("Enter integer : ");
int counter = 0;
        int i = mas.nextInt();
        int[] cat = new int[]{5, 10, 3, 99, 2};

            for (int index = 0; index < cat.length; index++)
            {
                if (i == cat[index])
                {
                    System.out.println("The number is in the array");
                    counter++;
                }
            }
            if  (counter == 0){
                    System.out.println("The number is't in the array");
                }
            }




    public static void deleteArrayElements() {
        int[] mynumbers = new int[]{8, 66, 17, 3, 14, 15};
        System.out.println("There is an array of x elements with numbers.");
        System.out.println("Enter number to check whether it is in the array: ");
        int enteredNumber = mas.nextInt();
        System.out.print(" ");
        //getArray(mynumbers);

        int counter = 0;
        for (int index = 0; index < mynumbers.length; index++) {
            if (mynumbers[index] == enteredNumber) {
                counter++;
            }
        }
        if (counter == 0) {
            getArray(mynumbers);
            System.out.println("This number is not in  the array ");
        } else {
            System.out.println("There is an array of (x-counter) elements with numbers: ");
            int[] newnumbers = new int[(mynumbers.length - counter)];
            int k;
            int j=0;
            k = mynumbers.length - counter;

            for (int i = 0; i < mynumbers.length; i++) {
                if (mynumbers[i] != enteredNumber) {
                    newnumbers[j] = mynumbers[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(newnumbers));

        }
    }


    public static void getArray(int[] array)
    {
        for (int index = 0; index < array.length; index++)
        {
            System.out.print(array[index] + "; ");
        }
    }

    public static void arrayRandom()
    {
        System.out.println("Enter integer : ");

        int i = mas.nextInt();
        int[] array = new int[i];
        for (int index = 0; index < array.length; index++)
        {
            array[index] = (int) (Math.random() * 100);}
        System.out.println(Arrays.toString(array));

        int max = array[0];
        for (int index = 0; index < array.length; index++)
        {
            max = Math.max(max, array[index]);
        }
        System.out.println("Maximum element: " + max);

        int min = array[0] + 1;
        for (int index = 0; index < array.length; index++)
        {
            if (array[index] < min)
            {
                min = array[index];
            }
        }
        System.out.println("Minimum element " + min);
        int sum = 0;
        for (int index = 0; index < array.length; index++)
        {
            sum += array[index];
        }
        double average = (double) sum / i;
        System.out.println("Average value : " + average);
    }

    public static void compareArrays()
        {
        int[] one = new int[]{5, 18, 3, 2, 2};
        int[] two= new int[]{8, 66, 17, 3, 14};
                System.out.println( "Array [] one" + Arrays.toString(one));
                    System.out.println( "Array [] two" + Arrays.toString(two));
            int sum = 0;
            int sumtwo = 0;
            for (int index = 0; index < one.length; index++)
            {
                sum += one[index];
            }
            double average = (double) sum / 5;
            System.out.println("Average value array one: " + average);

            for (int ind = 0; ind < two.length; ind++)
            {
                sumtwo += two[ind];
            }
            double averagetwo = (double) sumtwo / 5;
            System.out.println("Average value array two: " + averagetwo);

            if(average > averagetwo)
            {
                System.out.println("Average value array one > Average value array two" );
            }
            if(average == averagetwo)
            {
                System.out.println("Average value array one = Average value array two" );
            }
            else
            {
                System.out.println("Average value array one < Average value array two" );
            }
    }
}



