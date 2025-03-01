package sem_2.Task2_5;

class Waiter extends Thread {
    private final Restaurant restaurant;

    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                restaurant.takeDish();
                Thread.sleep(1000); // Подача блюда
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

