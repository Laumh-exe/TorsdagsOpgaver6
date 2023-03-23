package Task1;

public class MethodTest2 {


    public void methodA() {
        this.methodC("python");
        methodD(true);
        this.methodB('r');
    }

    public void methodB(char letter) {
        System.out.print(letter + " ");
        if (letter == 'r') {
            System.out.print("s ");
            methodD(false);
            this.methodB('v');
        }
        else {
            System.out.print("t ");
        }

    }

    private void methodC(String input) {
        if (input == "python") {
            methodC("java");
            System.out.print("v ");
        }
        else {
            System.out.print("j ");
        }
        System.out.print("a ");
    }

    private void methodD(boolean input) {
        if (input) {
            System.out.print("e ");
        }
        else {
            System.out.print("j ");
            System.out.print("o ");
        }
    }
}
