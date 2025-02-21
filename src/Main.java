import java.time.temporal.Temporal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Carla", "Aragón 24", "651965324",3,10);
        Programmer developer = new Programmer("Marcos", "Mallorca 45","697888014",2 );

        Organization HR = new Organization();
        HR.addEmployee(manager);
        HR.addEmployee(developer);

        System.out.println("\nPrint human resources employees: ");
        HR.printEmployess();

        System.out.println("\nPrint human resource after deleting manager");
        HR.removeEmployee(manager);
        HR.printEmployess();

    }
}