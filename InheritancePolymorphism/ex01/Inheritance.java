package InheritancePolymorphism.ex01;

class Human {
    String name;
    int age;
    void eat() {}
    void sleep() {}
}

class Student extends Human {
    int studentID;
    void goToSchool() {}
}

class Worker extends Human {
    int workID;
    void goToWork() {}
}

public class Inheritance {
    public static void main(String[] args) {

        // 1. Human 객체 생성
        Human h = new Student();
        h.name = "황고명";
        h.age = 5;
        h.eat();
        h.sleep();

        // 2. Student 객체 생성
        Student s = new Student();
        s.name = "신짱구";
        s.studentID = 12345;
        s.age = 10;
        s.eat();
        s.sleep();
        s.goToSchool();

        // 3. Worker 객체 생성
        Worker w = new Worker();
        w.name = "최마루";
        w.workID = 12345;
        w.age = 20;
        w.eat();
        w.sleep();
        w.goToWork();
    }
}
