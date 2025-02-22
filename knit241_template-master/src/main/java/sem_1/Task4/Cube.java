package sem_1.Task4;

public class Cube extends Shape {
    private final double r;

    public Cube(double r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return Math.pow(r, 3);
    }
}
