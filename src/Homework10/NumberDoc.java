package Homework10;

public class NumberDoc {
    public static void getNumber(String number ){
        String[]doc = number.split("-");
        System.out.println("Passed by value String was: " + number );
        System.out.println();
        for( String numbers : doc){
            System.out.print(numbers);
        }
        System.out.println();
        System.out.println();
            System.out.print("This's the first two blocks of 4 digits: " + doc[0]  + doc[2]);//Task1
        }
    public static void getNumberDoc(String number ){
        String[]doc = number.split("-");
        doc[1] = "***";
        doc[3] = "***";
        number = String.join("-", doc);
        System.out.println(number);
    }
    public static void getLitters(String number ){
        String[]doc = number.split("-");
        char[] symbols = doc[4].toCharArray();
        symbols[0] = '/';
        symbols[2] = '/';
        doc[4] = String.valueOf(symbols);
        String newString = String.join("/", doc[1], doc[3]);
        System.out.println("/" + newString.toLowerCase() + doc[4].toLowerCase());
    }
    public static void getStringBuilder(String number ){
        StringBuilder document = new StringBuilder(number);
        document.delete(0, 5);
        document.delete(3, 8);
        document.replace(3,4, "/");
        document.delete(7, 8);
        document.replace(7, 8, "/");
        document.replace(9, 10, "/");
        System.out.println("Litters :" + document );
    }
    public static void getCheckLitters(String number){
        if (number.contains("abc")|| number.contains( "ABC" )){
            System.out.print("The number of the document contains 'abc' or 'ABC'");
        }else {
            System.out.println("The number of the document doesn't contain 'abc' or 'ABC'.");
        }
    }
    public static void getCheckNums(String number){
        if (number.startsWith("555")){System.out.print("The number of the document starts with '555'");
        }
        else {System.out.print("The number of the document doesn't start with '555'");
        }
    }
    public static void getCheckN(String number) {
        if (number.endsWith("1a2b")){System.out.print("The number of the document ended with '1a2b'");
        }
        else {System.out.print("The number of the document doesn't end with '1a2b'");
        }
    }
    }
