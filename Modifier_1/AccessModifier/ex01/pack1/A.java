package Modifier_1.AccessModifier.ex01.pack1;

public class A {
    public int a = 1;
    protected int b =2;
    int c = 3; //default
    private int d = 4;

    public void print() { // a, b, c, d
        System.out.print(a + " "); // o
        System.out.print(b + " "); // o
        System.out.print(c + " "); // o
        System.out.print(d + " "); //o
        System.out.println();
    }
}
