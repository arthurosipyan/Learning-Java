package UdemyJavaProgrammingMasterclass.Section6_ClassesConstructorsInheritance.Point;

public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int _x, int _y){
        this.x = _x;
        this.y = _y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int _x){
        this.x = _x;
    }

    public void setY(int _y){
        this.y = _y;
    }

    public double distance(){
        return Math.sqrt((0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y));
    }

    public double distance(int x, int y){
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point point){
        return Math.sqrt((point.getX() - this.x) * (point.getX() - this.x) + (point.getY() - this.y) * (point.getY() - this.y));
    }
}