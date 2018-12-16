package Homework6;

public class SoftwareDeveloper implements Developer {

    @Override
    public void buildSoftware() {
        System.out.println("Developer can build software!");
    }

    @Override
    public void makeCodeReviews() {
        System.out.println("Developer can make code reviews!");
    }
}
