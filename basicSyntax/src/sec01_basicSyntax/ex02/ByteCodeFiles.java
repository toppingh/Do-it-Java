package sec01_basicSyntax.ex02;

// .class는 bin 폴더에 나온다.
// 소스파일의 개수와 관계없이 class 개수에 따라 .class 개수가 정해진다.

class A { // A.class

}

class B { // B.class

}

class C { // C.class
    class D { // C$D.class - C안에 D 클래스가 있다.

    }
}

public class ByteCodeFiles { // ByteCodeFiles.class
}
