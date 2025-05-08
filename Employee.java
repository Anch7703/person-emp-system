import java.text.ParseException;

class Employee extends perso{
    private int empid;
    private double salary;

    public Employee(String name, String dob, int empid, double salary)throws ParseException{
        super(name,dob);
        this.empid= empid;
        this.salary= salary;
    }
    public void displayEmployeeDetails(){
        System.out.println("Employee ID:"+ empid);
        System.out.println("Salary:$"+ salary);
    }
    public static void main(String[] args) throws ParseException{
        Employee emp= new Employee("Alice", "15-08-1990",101,75000);
        emp.displayEmployeeDetails();      
    }

}