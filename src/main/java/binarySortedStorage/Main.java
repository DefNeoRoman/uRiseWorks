package binarySortedStorage;

public class Main {
    public static void main(String[] args) {
        Composer composer = new Composer();
        composer.build(115);
        Build build = composer.getBuild();
        build.whatAppartmentsExist();
    }
}
