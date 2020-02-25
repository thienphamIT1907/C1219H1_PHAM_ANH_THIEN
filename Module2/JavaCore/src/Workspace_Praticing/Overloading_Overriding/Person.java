package Workspace_Praticing.Overloading_Overriding;

public class Person {
   private String name;
   private int age;
   private int phone;

   public Person() {

   }

   public void walk() {}

   public void walk(int far) {}

   public void walk(double a,int b, String c, long d) {}

   public static void main(String[] args) {
      Person ps = new Person();

      ps.walk();
   }
}
