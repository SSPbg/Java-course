package Homework6;

public class DevOps implements Developer, SystemAdmin {

    @Override
    public void canConfigureMachines() {
        System.out.println("System admin can configure machines!");
    }

    @Override
    public void canSupportSoftware() {
        System.out.println("System admin can support software!");
    }
    @Override
    public void buildSoftware() {
        System.out.println("System admin can build software!");
    }

    @Override
    public void makeCodeReviews() {
        System.out.println("System admin can make code reviews!");
    }
}
