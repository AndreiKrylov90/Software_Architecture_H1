package ModelElements;

/**
 * Камера
 * DONE: Сделаны 2 поля для класса, установен конструктор и геттеры, добавлены 2
 * метода, позволяющие повернуть камеру или перенести в другое место.
 */
public class Camera {

    private Point3D location;

    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void rotate(Angle3D angle3d) {

        angle = angle3d;

    }

    public void move(Point3D point3d) {

        location = point3d;
    }

}
