package Task1;

public class MethodTest {


    public static void methodA() {
        System.out.println("a");
        methodB('b');
    }

    public static void methodB(char letter) {
        System.out.println(letter);
        System.out.println("d");
    }

    public static void methodC() {
        System.out.println("e");
    }

    public static void methodD() {
        System.out.println("f");
    }
}
