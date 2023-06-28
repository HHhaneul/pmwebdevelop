package exam03;

public class Ex02 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.id = 894;
        s1.showInfo();

        Student s2 = new Student(1002, "학생2", "과목2");
        s2.showInfo();
    }
}
