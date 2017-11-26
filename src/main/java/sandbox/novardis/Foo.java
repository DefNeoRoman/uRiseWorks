package sandbox.novardis;

public class Foo {
    public Foo() {

    }
    public static Foo get(){
        return new Foo();
    }

    public static void main(String[] args) {
        Foo foo1 = get();
        Foo foo2 = new Foo();
    }
}
