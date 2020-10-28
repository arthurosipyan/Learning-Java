package UdemyJavaProgrammingMasterclass.Section6_ClassesConstructorsInheritance.WallArea;

public class Wall {
    private double width;
    private double height;

    public Wall(){

    }

    public Wall(double w, double h){
        if(w < 0){
            w = 0;
        }
        if(h < 0){
            h = 0;
        }
        this.width = w < 0 ? 0 : w;
        this.height = h < 0 ? 0 : h;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double w){
        this.width = w < 0 ? 0 : w;
    }

    public void setHeight(double h){
        this.height = h < 0 ? 0 : h;
    }

    public double getArea(){
        return this.width * this.height;
    }
}