package Employees;

public class Director implements Employees{
    String titleProfessions = "Director";

    @Override
    public void getTitleProfessions() {
        System.out.println("Title of professios is " + titleProfessions );
    }
}
