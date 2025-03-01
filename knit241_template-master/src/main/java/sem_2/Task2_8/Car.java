package sem_2.Task2_8;

class Car implements Runnable {
    private final TrafficLight trafficLight;
    private final String name;

    public Car(TrafficLight trafficLight, String name) {
        this.trafficLight = trafficLight;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (!trafficLight.isGreenLight()) {
                    System.out.println(name + " ждет зеленого света.");
                    trafficLight.waitForGreen();
                }
                System.out.println(name + " едет.");
                Thread.sleep(1000); // Движение
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

