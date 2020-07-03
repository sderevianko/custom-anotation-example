package test;

import classpointer.ClassPointer;

@ClassPointer
public class Test {

    final private String name = "Sem";
    final private int age = 30;

    public String changeName(String name) {
        return name + "junior";
    }

    public int changeAge(int age) {
        return age++;
    }

    @Override
    public String toString() {
        return "Test{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
