package Workspace_Praticing.LambdaExpression;
@FunctionalInterface
public interface PersonService {
    void sayHello();

    static void haha() {}

    static void staticMethod() {}
    static void haha1() {}

    default void breath1() {}
    default void breath2() {}
    default void breath3() {}

}
