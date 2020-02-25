package Workspace_Praticing.Overloading_Overriding;

public  class FatherClass {
    private String name;
    private int age;
    private String job;
    public static String address;

    public FatherClass() {
    }

    public FatherClass(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
        FatherClass.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        FatherClass.address = address;
    }

    public void changeAddress() {
        address = "Japan";
    }

    @Override
    public String toString() {
        return "FatherClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' + getAddress()
                    +                '}';
    }

    public void fuckaing() {
        System.out.println("Fucking");
    }
}
