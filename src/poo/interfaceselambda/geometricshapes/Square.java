package poo.interfaceselambda.geometricshapes;

public class Square implements Shape {
    float sideLenght = 0;

    public Square (float sideLength){
        this.sideLenght = sideLength;
    }

    @Override
    public float area () {
        return sideLenght * sideLenght;
    }

    public void setSideLength (float value) {
        this.sideLenght = value;
    }
}
