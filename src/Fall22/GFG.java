package Fall22;

public interface GFG {
    void learnCoding();
    void learnProgramming();
    void contribute();
}

abstract class Student implements GFG {
    public void learnCoding() {
        System.out.println("Let's make coding a habit with GFG");
    }
    public void learnProgramming() {
        System.out.println("Let's Learn Java");
    }
}

class GEEK extends Student {
    public void contribute() {
        System.out.println("Let's help others to Learn java");
    }
    public void learnCoding() {
        System.out.println("Let's make coding a habit with Java");
    }
}

