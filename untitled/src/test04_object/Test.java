package test04_object;

public class Test {
    public static void main(String[] args) {
        Student st = new Student("조수훈", 99, "아무전공");
        Student st2 = new Student("조수훈", 99, "아무전공");

//        System.out.println(st);
//        System.out.println(st.toString());
        System.out.println(st == st2);      //false
        System.out.println(st.equals(st2));     //false
    }
}

