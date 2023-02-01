public class Rectangle {

    private double kisa;
    private double uzun;
    private double x;
    private double y;

    public Rectangle (double x, double y, double kisa, double uzun) {
        this.x=x;
        this.y=y;
        this.kisa=kisa;
        this.uzun=uzun;

    }

    public void setKisa(double S){
        this.kisa=S;

    }
    public double getKisa () {
        return this.kisa;

    }
    public void setUzun (double L) {
        this.uzun=L;

    }
    public double getUzun () {
        return this.uzun;


    }
    public void setX(double S){
        this.x=x;

    }
    public double getX () {
        return this.x;

    }
    public void setY (double L) {
        this.y=y;

    }
    public double getY () {
        return this.y;

    }
    //setter Getter (setKisa,getKisa ,,,setX, getX ,..)

    public void move(double deltaX, double deltaY) {
        x+=deltaX;
        y+=deltaY;
    }

    public double getPerimeter (){
        double perimeter;
        perimeter= 2*(kisa+uzun);
        return perimeter;

    }
    public double getArea (){
        double area;
        area= kisa*uzun;
        return area;

    }
}





