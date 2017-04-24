package core.oop;

/**
 * Created by ehimnay on 23/02/2017.
 */
public class A {
    private final String name = "Class A";

    private void m1() {
        System.out.println("m1");
    }

    public void m2(final A a) {
        a.m1();
        System.out.println(a.name);
    }
}
