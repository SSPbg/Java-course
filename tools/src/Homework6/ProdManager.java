package Homework6;

public class ProdManager implements Manager {

    @Override
    public void canManagePeople() {
        System.out.println("Manager can manage people!");
    }

    @Override
    public void canDrinkCoffee() {
        System.out.println("Manager can drink coffee all day!");
    }
    @Override
    public void buildSoftware() {
        System.out.println("Manager can build software!");
    }

    @Override
    public void makeCodeReviews() {
        System.out.println("Manager can make code reviews!");
    }
}
