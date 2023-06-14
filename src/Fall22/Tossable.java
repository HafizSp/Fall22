package Fall22;

public interface Tossable {
    void toss();
}

class Ball implements Tossable {
    private String bandName;

    public Ball(String bandName) {
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void bounce() {
        System.out.println("Ball bounce");
    }

    @Override
    public void toss() {
    }
}

class Rock implements Tossable {

    @Override
    public void toss() {
    }
}

class BaseBall extends Ball {
    public BaseBall(String bandName) {
        super(bandName);
    }
    @Override
    public void toss() {
    }

    @Override
    public void bounce() {
        System.out.println("Baseball bounce");
    }
}

class FootBall extends Ball {
    public FootBall(String bandName) {
        super(bandName);
    }

    @Override
    public void toss() {
    }

    @Override
    public void bounce() {
        System.out.println("Football bounce");
    }

}

class Main2 {
    public static void main(String[] args) {
        BaseBall baseBall = new BaseBall("joker");
        FootBall footBall = new FootBall("batman");

        baseBall.bounce();
        footBall.bounce();
    }
}
