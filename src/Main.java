import java.util.Arrays;
public class Main {
    public static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        //An array of type Employee to store employees data
         employees = new Employee[] {
                 new Employee( "Tom Ford", 1,108_000),
                 new Employee("Judith Leiber", 2, 99_000),
                 new Employee("John Galliano", 2,99_000),
                 new Employee("Guo Pei", 3, 99_000),
                 new Employee("Miuccia Prada",4,99_000 ),
                 new Employee("Demna Gvasalia", 5,99_000),
                 new Employee("Ann Demeulemeester", 3,108_000),
                 new Employee("Thierry Mugler",3, 270_000),
                 new Employee("Saint Laurent",1, 108_000),
                 new Employee("Vera Wang", 4, 270_000)
         };

        printEmployeeData();
        System.out.println("Salaries total is: " + totalAmountForSalaries());
        System.out.println("Average salary is: " + calculateAverageSalary());
        printNames();
        System.out.println(findMinimumSalary());
        System.out.println(findMaximumSalary());
    }

    public static void printEmployeeData(){
        for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
    public static int totalAmountForSalaries(){
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

    public static Employee findMinimumSalary(){
        Employee employeeWithMinSalary = employees[0];
        int minimum = employees[0].getSalary();
       for(int i = 0; i < employees.length; i++){
           if(employees[i].getSalary() < minimum){
               minimum = employees[i].getSalary();
               employeeWithMinSalary = employees[i];
           }
       }
        return employeeWithMinSalary;
    }

    public static Employee findMaximumSalary(){
        Employee employeeWithMaxSalary = employees[0];
        int maximum = employees[0].getSalary();
        for(int i = 0; i < employees.length; i++){
            if(employees[i].getSalary() > maximum){
                maximum = employees[i].getSalary();
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }

    public static double calculateAverageSalary(){
        int totalSalary = 0;
        int employeeTotal = Employee.getCounter();
        double averageSalary;
        for(int i = 0; i < employees.length; i++){
            totalSalary += employees[i].getSalary();
        }
        averageSalary = totalSalary / employeeTotal;

        return averageSalary;
    }

    public static void printNames(){
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }
}