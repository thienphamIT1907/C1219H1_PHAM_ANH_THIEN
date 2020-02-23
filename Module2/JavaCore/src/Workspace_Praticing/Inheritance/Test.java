package Workspace_Praticing.Inheritance;

public class Test {
    public static void main(String[] args) {
        Manager mgn = new Manager("Haha", 10000, "19-07-1996", 5000);
        Employee emp = new Employee("Hoho", 5000, "21-06-1994");

        System.out.println(mgn.getSalary());
        System.out.println(emp.getSalary());

        System.out.println(mgn.getName());
        System.out.println(emp.getName());
    }


}
