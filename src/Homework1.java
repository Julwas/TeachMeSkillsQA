import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    static Scanner mas;

    public static void main(String[] args)
    {
        mas = new Scanner(System.in);

        //numberIncluded();

        //System.out.println();
        //enterNumber();
        deleteArrayElements();
        //System.out.println();
       // arrayRandom();

       // System.out.println();
        //compareArrays();

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
//nodone
            public static void deleteArrayElements(){
                int[] myarray = new int[]{5, 18, 3, 2, 12, 5, 100};
                int[] newarray;
                System.out.println("Enter a number to check whether it is in the array: : ");
                int enteredNumber = mas.nextInt();
                System.out.print("Original array is: " );

                getArray(myarray);
                int counter = 0;

               System.out.println("This number is not found in array");
// Сколько раз значение элемента массива совпало со значением enteredNumber
                for (int index = 0; index < myarray.length; index++) {
           if (myarray[index] == enteredNumber) {
               counter++;}
                    if (counter == 0) {
                        System.out.println("This number is not found in array");
                        getArray(myarray);
                        // 8. Надо создать новый массив и дать ему значение количество элементов по формуле
//            // 9. originArrray.length - counter (количество совпадений).
//            // 10. Скопировать все элементы массива с несоответствующим значением в новый массив
                    }
                    else{
                        newarray = new int[myarray.length - counter];
                        getArray(myarray);
                        //for( k = 0; k < (myarray.length - counter); k++ )
                           // if (myarray[index] != enteredNumber){
                              //  newarray[k] = myarray[index];
                               // System.out.print(" " + newarray[counter]);
                                //counter++;
                            }
                        }

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



