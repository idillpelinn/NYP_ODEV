
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public Point(Point objPoint) {

        this.x = objPoint.x;
        this.y = objPoint.y;
    }

    public double getX() {
        return x;
    }


    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double distance (Point p){

        //=((x1-x2)karesi + (y1-y2)karesi) karekok içinde
        double uzaklik= Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2));

        return uzaklik;

    }
    public Point findClosest (Point [] pointArray){
        //en yakın nokta
        double closest=distance(pointArray[0]);
        int index=0;
        for(int i=0;i<pointArray.length;i++){
            double uzaklik=distance(pointArray[i]);

            if(uzaklik<closest){
                closest=uzaklik;
                index=i;
            }


        }


        return pointArray[index];

    }

    public static double distance2 (Point p){

        //=((x1-x2)karesi + (y1-y2)karesi) karekok içinde
        double uzaklik= Math.sqrt(Math.pow((0-p.x),2)+Math.pow((0-p.y),2));

        return uzaklik;

    }
    public static Point findFurthest(Point [] pointArray) {
        //en uzak nokta bul

        double furthest = distance2(pointArray[0]);

        int index = 0;

        for (int i = 0; i < pointArray.length; i++) {
            double uzaklik = distance2(pointArray[i]);

            if (uzaklik > furthest) {
                furthest = uzaklik;
                index = i;
            }


        }


        return pointArray[index];
    }}