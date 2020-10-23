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

    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}