package Modifier_2.AbstractModifier.ex02;

// 추상 클래스, ㅊ루상 메서드를 사용하는 경우
abstract class Animal {
    abstract void cry(); // 중괄호 없이 메서드 괄호만 사용, 하나라도 abstract 메서드를 가지면 class도 abstract 클래스가 되어야 한다.
}

class Cat extends Animal { // 상속받는 Animal클래스의 cry()가 abstract 메서드이므로, 자식 클래스 Cat도 abstract class가 되어야 함
    void cry() { // cry()를 overriding 했으므로 abstract 클래스가 아니여도 됨
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    void cry() {
        System.out.println("멍멍");
    }
}

abstract class B { // abstract 메서드 없이 absract 클래스로만 선언은 가능하나, 객체를 만들 수 없으므로 abstract 클래스만 만들 이유가 없다.
    void bcd() {

    }
}

public class AbstractModifier_2 {
    public static void main(String[] args) {
        // 1. 객체 생성
        Animal cat = new Cat();
        Animal dog = new Dog();

        // 2. 메서드 호출
        cat.cry();
        dog.cry();
    }
}
