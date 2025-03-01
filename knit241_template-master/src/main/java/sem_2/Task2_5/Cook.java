package sem_2.Task2_5;

class Cook extends Thread {
    private final Restaurant restaurant;

    public Cook(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                restaurant.addDish();
                Thread.sleep(1500); // Приготовление блюда
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

