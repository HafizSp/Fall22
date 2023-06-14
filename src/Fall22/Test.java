package Fall22;

public class Test {
    public static void main(String[] args) {
        try {
            int a = 20, b = 30, c = 10;
            int x = (a * b) / (a - b + c);
            System.out.println("Result:" + x);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        }

    }
}
