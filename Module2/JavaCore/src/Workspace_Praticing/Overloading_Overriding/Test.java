package Workspace_Praticing.Overloading_Overriding;

public class Test {
    public static String sayWhat = "aad";
    public void show() {
        System.out.println();
    }
    public static void showHaveStatic() {
        System.out.println();
    }

    public static void main(String[] args) {
        FatherClass godFather = new FatherClass("Thien", 28, "Fullstack-Dev");
        System.out.println(godFather.toString());

        System.out.println(FatherClass.getAddress());

        System.out.println(sayWhat);

        show(godFather);

        final int num;

        num = 10;
        System.out.println(num);
    }

    private static void show(FatherClass father) {
        System.out.println(father.toString());
    }
}
