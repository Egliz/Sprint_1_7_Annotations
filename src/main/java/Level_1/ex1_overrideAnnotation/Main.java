package Level_1.ex1_overrideAnnotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("Carmen", "Perez", 8);
        OnlineWorker onlineWorker = new OnlineWorker("Maria", "Soto", 20);
        OnSiteWorker onSiteWorker = new OnSiteWorker ("Brad", "Pitt", 35);

        int hoursWorked = 160;
        System.out.println(worker.toString() + "Salary: " + worker.calculateSalary(hoursWorked));
        System.out.println(onlineWorker.toString() + "Salary: " + onlineWorker.calculateSalary(hoursWorked));
        System.out.println(onSiteWorker.toString() + "Salary: " + onSiteWorker.calculateSalary(hoursWorked));
    }
}
