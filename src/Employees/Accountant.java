package Employees;

public class Accountant implements Employees {
    String titleProfessions = "Accountant";
    @Override
    public void getTitleProfessions() {
        System.out.println("Title of professios is " + titleProfessions );
    }
}
