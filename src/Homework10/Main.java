package Homework10;

public class Main {
    public static void main(String[] args){
        System.out.println();
       String number = "1234-abc-5678-def-9g0h";
       NumberDoc.getNumber(number);
        System.out.println();
        NumberDoc.getNumberDoc(number);
        System.out.println();
        NumberDoc.getLitters(number);
        System.out.println();
        NumberDoc.getStringBuilder(number);
        System.out.println();
        NumberDoc.getCheckLitters(number);
        System.out.println();
        NumberDoc.getCheckNums(number);
        System.out.println();
        NumberDoc.getCheckN(number);
    }
}
