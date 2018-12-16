package Homework6;

public class CTO implements Developer,SystemAdmin, QA, Manager {
    @Override
    public void buildSoftware() {
        System.out.println("CTO can build software!");
    }

    @Override
    public void makeCodeReviews() {
        System.out.println("CTO can make code reviews!");
    }

    @Override
    public void canManagePeople() {
        System.out.println("CTO can manage people!");
    }

    @Override
    public void canDrinkCoffee() {
        System.out.println("CTO is very conscientious and industrious, he won't drink coffee all day!");
    }

    @Override
    public void canVerifySoftwareQuality() {
        System.out.println("CTO can verify software quality!");
    }

    @Override
    public void canConfigureMachines() {
        System.out.println("CTO can configure machines!");
    }

    @Override
    public void canSupportSoftware() {
        System.out.println("CTO can support software!");
    }
}