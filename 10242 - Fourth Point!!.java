import java.util.*;
import java.awt.geom.Point2D;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextDouble()) {

            ArrayList<Point2D> points = new ArrayList<Point2D>();
            Point2D repeat = new Point2D.Double();
            for (int i = 0; i < 4; i++) {
                Point2D point = new Point2D.Double(sc.nextDouble(), sc.nextDouble());

                if (!points.contains(point)) {
                    points.add(point);
                } else {
                    points.remove(point);
                    repeat = point;
                }
            }

            double x = points.get(0).getX() + points.get(1).getX() - repeat.getX();
            double y = points.get(0).getY() + points.get(1).getY() - repeat.getY();

            System.out.printf("%.3f %.3f", x, y);
            System.out.println();
        }
    }
}
