package CarpetCostCalculator;

public class Floor {
    private double width;
    private double length;

    public Floor(double w, double l){
        this.width = w < 0 ? 0 : w;
        this.length = l < 0 ? 0 : l;
    }

    public double getArea(){
        return this.width * this.length;
    }
}