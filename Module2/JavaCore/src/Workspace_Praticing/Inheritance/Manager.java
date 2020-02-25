package Workspace_Praticing.Inheritance;

public class Manager extends Employee {
    private int bonus;

    public Manager() {super();}

    public Manager(String name, int salary, String hireDay, int bonus) {
        super(name, salary, hireDay);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getSalary() {
        return this.bonus + super.getSalary();
    }

    public void choice() {

    }
}
