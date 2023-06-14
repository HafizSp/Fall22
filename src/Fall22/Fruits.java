package Fall22;

public abstract class Fruits {
    public String color;
    abstract void display();
}

class Apple extends Fruits {
    String color = "Red";

    @Override
    void display() {
        System.out.println("Apple is " + color);
    }
}

class Banana extends Fruits {
    public String color = "Yellow";

    @Override
    void display() {
        System.out.println("Banana is " + color);
    }
}

class Main1 {
    public static void main(String[] args) {
        Fruits apple = new Apple();
        Fruits banana = new Banana();

        apple.display();
        banana.display();
    }
}