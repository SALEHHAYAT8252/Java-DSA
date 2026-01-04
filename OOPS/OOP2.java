public class OOP2 {
    public static void main(String[] args) {
        Employee e = new Employee("john", 100, 100000000);
        // e.Employee();
    }
}


class Employee {
    String name ;
    int id;
    int salary;

    Employee(String name,int id ,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    // public void Employee(){
    //     System.out.println("Name "+name+"\nid "+id+"\nSalary "+salary);
    // }
}