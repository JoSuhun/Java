package test04_object;

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("Person의 기본생성자 입니다.");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        super();
        this.name = name;
    }

    public void eat() {
        System.out.println("음식을 먹는다.");
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }


}
