package Fall22;

interface Machine {
    void start();
    void stop();
}

class Car implements Machine {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

class WaterPump implements Machine {
    @Override
    public void start() {
        System.out.println("Water pump started");
    }

    @Override
    public void stop() {
        System.out.println("Water pump stopped");
    }
}

class Main {
    public static void main(String[] args) {
        Machine car = new Car();
        Machine waterPump = new WaterPump();

        // Start and stop the car
        car.start();
        car.stop();

        // Start and stop the water pump
        waterPump.start();
        waterPump.stop();
    }
}

