package Employees;

public class MyMain {
    public static void main(String[] args){
        getTitleProfessions();
    }
    public static void getTitleProfessions(){
        Director employee1 = new Director();
        employee1.getTitleProfessions();

        Accountant employee2 = new Accountant();
        employee2.getTitleProfessions();

        Worker employee3 = new Worker();
        employee3.getTitleProfessions();
    }
}

