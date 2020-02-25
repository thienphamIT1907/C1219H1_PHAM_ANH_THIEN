package Workspace_Praticing.EpKieu;

public class Main {
    public static class Person {
        private String name;
        private int luong;
        Person() {}
        public void showLuong() {
            System.out.println("luong person");
        }
    }

    public static class Worker extends Person {
        Worker() {}
        public void showLuong() {
            System.out.println("luong worker");
        }
    }

    public static void main(String[] args) {
        Worker w = new Worker();
        Person e = new Worker();


        w.showLuong();
        e.showLuong();
    }

}
