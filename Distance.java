public class Distance {
    public static int distance(Position point1, Position point2) {
        double dx = point2.getX() - point1.getX();
        double dy = point2.getY() - point1.getY();
        return (int) Math.sqrt(dx * dx + dy * dy);
    }

}
