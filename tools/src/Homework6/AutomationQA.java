package Homework6;

public class AutomationQA implements QA, Developer {

    @Override
    public void canVerifySoftwareQuality() {
        System.out.println("QAs can verify software quality!");
    }
    @Override
    public void buildSoftware() {
        System.out.println("QAs can implement QA!");
    }

    @Override
    public void makeCodeReviews() {
        System.out.println("QAs can write automation tests!");
    }
}
