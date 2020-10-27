package MasterOOPChallenge;

public class DeluxeBurger extends Hamburger {
    private static final String NO_ADDITIONAL_ITEMS = "Cannnot add additional items to a delux burger";
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println(NO_ADDITIONAL_ITEMS);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println(NO_ADDITIONAL_ITEMS);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println(NO_ADDITIONAL_ITEMS);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println(NO_ADDITIONAL_ITEMS);
    }
}
