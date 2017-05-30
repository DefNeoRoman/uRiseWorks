package binarySortedStorage;

public class Main {
    public static void main(String[] args) throws Exception{
        Composer composer = new Composer();
        composer.build(5);
        Build build = composer.getBuild();
        Build build2 = composer.binarySort(build);
        build2.whatAppartmentsExist();
    }
}
