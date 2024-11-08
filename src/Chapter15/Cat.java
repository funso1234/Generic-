package Chapter15;

import java.io.Serializable;

public class Cat implements Serializable, Comparable<Cat> {

    private String name;
    private int age;

    public Cat() {}


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int compareTo(Cat cat) {
        return 5;
    }
}
