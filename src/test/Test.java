package test;

import classpointer.ClassPointer;

@ClassPointer
public class Test {

    private final String name = "Sem";
    private final int age = 30;

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
