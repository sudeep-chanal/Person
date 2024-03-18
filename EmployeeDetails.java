class EmployeeDetails extends Person {
    private int empId;
    private double salary;

    public EmployeeDetails(String name, String dateOfBirth, int empId, double salary) {
        super(name, dateOfBirth);
        this.empId = empId;
        this.salary = salary;
    }

    
    public int getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

  
    public static void main(String[] args) {
        
        EmployeeDetails emp = new EmployeeDetails("John Doe", "1990-05-15", 101, 50000.0);

     
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Date of Birth: " + emp.getDateOfBirth());
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Salary: $" + emp.getSalary());
    }
}