package Fall22;

public class X {
    public static void main(String[] args) {
        try {
            badMehthod();
            System.out.println("A");
        } catch(RuntimeException ex) {
            System.out.println("B");
        } catch(Exception ex1) {
            System.out.println("C");
        }
        finally {
            System.out.println("D");
        }
        System.out.println("E");
    }
    public static void badMehthod() {
        throw new RuntimeException();
    }
}
