package test04_object;

public class Student extends Person {
    String major;
    public Student() {
        this("전공전공");
        System.out.println("Student의 기본 생성자 입니다.");
    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name, int age, String major){
        super(name, age);
        this.major = major;
    }

    public void study() {
        super.eat();
        System.out.println("공부를 한다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                ", name='" + super.name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return name.equals(((Student)obj).name);
    }
}
