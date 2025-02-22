package sem_1.Task4;

public class Cylinder extends Shape {

    private double r;
    private  double h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(r, 2) * h;
    }
}