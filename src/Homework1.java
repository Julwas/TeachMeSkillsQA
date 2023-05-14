import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    static Scanner mas;

    public static void main(String[] args)
    {
        mas = new Scanner(System.in);

        numberIncluded();

        System.out.println();
        //enterNumber();

        System.out.println();
        arrayRandom();

        System.out.println();
        compareArrays();

        mas.close();
    }



    public static void numberIncluded()
        {

            System.out.println("Enter integer : ");

            int i = mas.nextInt();
            int[] cat = new int[] { 5, 10, 3, 99, 2 };
            {
                for (int index = 0; index < cat.length; index++)
                {
                    if(i == cat[index])
                    {
                        System.out.println( "The number is in the array");
                        break;
                    }
                    else{
                        System.out.println( "The number is't in the array");
                        break;
                    }
                }
            }
        }
        //no done
        public static void enterNumber()
        {
            System.out.println("Enter integer : ");
            int i = mas.nextInt();
            int[] dog = new int[]{1, 5, 18, 3, 2, 4, 8};
            int[] newDog = null;

                for (int index = 0; index< dog.length; index++)
                {
                    if (i == dog[index])
                    {
                        int elementToBeDeleted = i;

                        System.out.println("Original Array is: "+Arrays.toString(dog));
                        System.out.println();
                        for (int index1 = 0; index1 < dog.length-1; index1++) {
                            if(dog[index1] == elementToBeDeleted)
                            {
                                newDog = new int[dog.length - 1];
                                for(int ind = 0; ind < i; ind++){
                                    newDog[ind] = dog[ind];
                                }
                                for(int j = index1; j < dog.length - 1; j++){
                                    newDog[j] = dog[j+1];
                                }
                                break;
                            }
                        }
                        System.out.println("New Array after deleting element = "+elementToBeDeleted+" and shifting: "+ Arrays.toString(newDog));

                    }
                    else
                    {
                        System.out.println("There is no such number");
                    }
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



