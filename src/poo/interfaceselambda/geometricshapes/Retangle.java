package poo.interfaceselambda.geometricshapes;

public class Retangle implements Shape {
    private float width = 0;
    private float height = 0;

    public Retangle (float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float area () {
        return width * height;
    }

    public void setWidth (float value) {
        this.width = value;
    }

    public void setHeight (float value) {
        this.height = value;
    }
}
