package Employees;

public class Worker implements Employees{
    String titleProfessions = "Worker";

    @Override
    public void getTitleProfessions() {
        System.out.println("Title of professios is " + titleProfessions );
    }
}
