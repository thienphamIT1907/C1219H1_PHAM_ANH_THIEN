package Workspace_Praticing.LambdaExpression;

public class Main {
    public static void main(String[] args) {
        //Vì không có tên nên PersonService đại diện cho 1 class
        // dấu () ch biết nó là constructor khi new và nó implement interface PersonServices
        //Áp dụng cho interface có duy nhất 1 abstract method (@FunctionallIterface)
        PersonService ps = new PersonService() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };

        //convert to lambda expression
        PersonService ps2 = () -> {
            System.out.println("Hi there...");
        };
        //call method thông qua Interface
        ps.sayHello();
        ps2.sayHello();




        PersonActionAbstractClass test =  new PersonActionAbstractClass() {
            @Override
            void xinChao(String name) {
                System.out.println("Hello" + name);
            }
        };
    }

}
