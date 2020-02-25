package Workspace_Praticing.Overloading_Overriding;

public class ChildClass extends FatherClass {
    private String kindOfMilk;
    private String toy;

    ChildClass() {

    }

    public static void setAddress(String address) {
        FatherClass.address = address;
    }

    @Override
    public void fuckaing() {
        super.fuckaing();
    }
}
