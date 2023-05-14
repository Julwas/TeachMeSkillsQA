import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    static Scanner mas;

    public static void main(String[] args)
    {
        mas = new Scanner(System.in);

      //arrayTask0();
      arrayTask1();
        //array2();
        mas.close();
    }
    public static void arrayTask0()
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
        public static void arrayTask1() {
            int[] dog = new int[]{5, 18, 3, 2, 2};
            int[] newDog = null;
            System.out.println("Enter integer : ");
            int i = mas.nextInt();
            {
                for (int index = 0; index< dog.length; index++)
                {
                    if (i == dog[index])
                    {
                        int elementToBeDeleted = i;

                        System.out.println("Original Array is: "+Arrays.toString(dog));

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

                    } else
                    {
                        System.out.println("There is no such number");
                    }
                }
            }
//no done
            public static void array2()
            {
                System.out.println("Enter n : ");
                int[] array = new int[n];
                for (int i = 0; i < array.length; i++)
                {
                    array[i] = (int) (Math.random() * 100 );

                    System.out.print( array[i] + " " );

                }

            }
        }

}


