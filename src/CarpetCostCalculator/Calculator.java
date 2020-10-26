package CarpetCostCalculator;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor f, Carpet c){
        this.floor = f;
        this.carpet = c;
    }

    public double getTotalCost(){
        return this.floor.getArea() * this.carpet.getCost();
    }
}