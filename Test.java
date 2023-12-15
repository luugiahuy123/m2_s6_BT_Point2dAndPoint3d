package ss6.ss6.BT_Point2dAndPoint3d;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D( 2 , 5);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D.setZ(3.6f);
        System.out.println(point3D);
    }
}
