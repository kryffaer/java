package sem_1.Task4;

public class Sphere extends Shape {

    private final double r;


    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return (double) 4 / 3 * Math.PI * Math.pow(r, 3);
    }
}
