package Workspace_Praticing.Explicit;

public class test {
    static class Parent {
        public void disp() {
            System.out.println("Parent disp called");
        }
    }

    public static class Child extends Parent {
        public void disp() {
            System.out.println("Child disp called");
        }

        public static void main(String[] args) {
            Parent p = new Child();
            p.disp();

//            Child c = (Child) p;
//            c.disp();
        }
    }
}
