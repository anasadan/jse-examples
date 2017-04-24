package core.oop;

/**
 * Created by ehimnay on 23/02/2017.
 */
public class CallingPrivateMethod {
    public static void main(String[] args) {
        // new A().m1(); cannot compile
        A a = new A();
        A b = new A();
        a.m2(b); // can compile
    }
}
