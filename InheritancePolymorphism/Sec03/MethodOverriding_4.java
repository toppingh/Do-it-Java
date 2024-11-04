package InheritancePolymorphism.Sec03;

class A1 {
    protected void abc() {}
}

class B1 extends A1 {
    public void abc() {}
}

class B2 extends A1 {
    protected void abc() {}
}

class B3 extends A1 {
//    void abc() {} // default 접근지정자 (좁아져서 불가능)
}

class B4 extends A1 {
//    private abc() {} // private 접근지정자 (좁아져서 불가능)
}

public class MethodOverriding_4 {
    public static void main(String[] args) {

    }
}
