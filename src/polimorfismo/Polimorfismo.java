package polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        A a = new A();
        a.f(5);

        A b = new B();
        b.f(10);

        A c = new C();
        c.f(10);

        A d = new D();
        d.f(0);

    }

}
