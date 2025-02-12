package Modifier_2.AbstractModifier.ex01;

// 일반 클래스를 상속하는 경우
class Animal {
    void cry() {}
}

class Cat extends Animal {
    void cry() { // Animal.cry() Override
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    void cry() { // Animal.cry() Override
        System.out.println("멍멍");
    }
}

public class AbstractModifier_1 {
    public static void main(String[] args) {

        // 1. 객체 생성
        Animal cat = new Cat();
        Animal dog = new Dog();

        // 2. 메서드 호출
        cat.cry(); // 야옹
        dog.cry(); // 멍멍
    }
}
