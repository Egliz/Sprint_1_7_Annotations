package Level_1.ex1_overrideAnnotation;

public class Worker {

    private String name;
    private String surname;
    public static double hourlyRate;

    public Worker(String name, String surname, double hourlyRate) {
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(int hoursWorked){
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}