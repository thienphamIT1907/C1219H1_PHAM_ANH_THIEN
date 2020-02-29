package Workspace_Praticing.Generic;

import java.util.ArrayList;

public class Controller<E extends People> {
    public ArrayList<E> list = new ArrayList<>();

    public Controller() {}

    public void add(E e) {
        list.add(e);
    }

    public E get(int index) {
        return list.get(index);
    }

    public void show() {
        list.forEach(e -> System.out.println(e.toString() + " "));
    }
}


