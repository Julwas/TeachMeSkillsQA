import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {

     //  swithcOperator("8");
      // ifSeasons(2);
        //evenOrOdd(13);
        //ifTemperature(5);
       // rainbowCololr(2);
       // forTask1();
        //forTask2();
        //forTask3();
        forTask4();
    }
    //task1
    public static void swithcOperator(String month){

        switch(month)
        {
            case "1":
            case "2":
            case "12":
                System.out.println("This is :Winter");
                break;
            case "6":
            case "7":
            case "8":
                System.out.println("This is :Summer");
                break;
            case "9":
            case "10":
            case "11":
                System.out.println("This is :Autumn");
                break;
            default:
                System.out.println("This is :Spring");
                break;
        }
    }
    //task2
    public static void ifSeasons(int month )
    {
        if (month > 9 && month < 12)
        {
            System.out.println("This is :Autumn");
        }
        if (month > 3 && month < 6)
        {
            System.out.println("This is :Spring");
        }
        if (month > 5 && month < 9)
        {
            System.out.println("This is :Summer");
        }
        else
        {
            System.out.println("This is :Winter");
        }
    }
//task3
    public static void  evenOrOdd(int a)
    {
        if((a%2)==0)
        {
            System.out.println("This is : even");
        }
        else
        {
            System.out.println("This is : odd");
        }
    }
    //task 4
    public static void ifTemperature(int t )
    {
        if (t> -20 && t <= -5)
        {
            System.out.println("The weather is normal");
        }
        if (t > -5)
        {
            System.out.println("The weather is warm");
        }
        else
        {
            System.out.println("The weather is cold");
        }
    }
    //task 5
    public static void rainbowCololr(int nColor )
    {
        String color = (nColor == 1) ? "Red" : (nColor == 2) ? "Orange" :
        (nColor == 3) ? "y" : (nColor == 4) ? "g" : (nColor == 5) ? "b" :
                (nColor == 6) ? "db" : "purple";

        System.out.println(color);
    }
    //task1 cykly

    public static void forTask1()
    {
        for (int a = 1; a<=99; a++)
        {
            if( a % 2!=0)
            {
                System.out.println(--a);
            }
        };

    }
    //task2
    public static void forTask2()
    {
        for (int a = 5; a>=1; --a)
                {
                System.out.println(a);
            }
    }
    //task 3
    public static void forTask3()
    {
        Scanner nom = new Scanner(System.in);
        System.out.println( "Enter number " );
        int number = nom.nextInt();
        {

          while (number > 1) // логическое условие
            {
               System.out.println(number++); // тело, что должно произойти
            }
        }
    }

    public static void forTask4()
    {
        int n =7;
        for(int i=0; i<13; i++)
        {
            System.out.println(n);
            n+=7;
        }

    }

}

