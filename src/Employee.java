public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private int iD;
    private static int counter = 0;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.iD = counter++;
    }
    //Getters
    public String getFullName(){
        return fullName;
    }

    public int getDepartment(){
        return department;
    }

    public int getSalary(){
        return salary;
    }

    public int getiD(){
        return iD;
    }

    public static int getCounter(){
        return counter;
    }
    //Setters
    public void setDepartment(int department){
        this.department = department;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    //toString
    @Override
    public String toString(){
        String employeeName = "Employee name: " + fullName + ", ";
        String employeeDepartment = "Department: " + department + ", ";
        String employeeSalary = "Salary: " + salary + ", ";
        String employeeID = "ID: " + iD;
        return employeeName + employeeDepartment + employeeSalary + employeeID;
    }




}
