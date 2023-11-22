package ModelElements;

/**
 * Источник света
 * DONE: Сделаны 4 поля для класса, установен конструктор и геттеры, добавлены 2 метода, позволяющие повернуть источник света или перенести в другое место. 
 */
public class Flash {

    private Point3D location;

    private Angle3D angle;

    private Color color;

    private Float power;

    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public Color getColor() {
        return color;
    }

    public Float getPower() {
        return power;
    }

    public void rotate(Angle3D angle3d) {

        angle = angle3d;

    }

    public void move(Point3D point3d) {

        location = point3d;

    }

}
