package test;

import classpointer.ClassPointer;

@ClassPointer
public class Test {

    private String name = "Sem";
    private int age = 30;

    public String ChangerName(String name) {
        return name + "junior";
    }

    public int ChangerAge(int age) {
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
