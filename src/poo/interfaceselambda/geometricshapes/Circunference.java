package poo.interfaceselambda.geometricshapes;

public class Circunference implements Shape {
    private float radius = 0;

    public Circunference (float radius) {
        this.radius = radius;
    }

    @Override
    public float area () {
        return (float) (Math.PI * (radius * radius));
    }

    public void setRadius (float value) {
        this.radius = value;
    }
}
