package Homework6;

public class ITDemo {
    public static void main(String[] args) {
        SoftwareDeveloper dev = new SoftwareDeveloper();

        dev.buildSoftware();
        dev.makeCodeReviews();
        System.out.println();

        DevOps admin = new DevOps();

        admin.canConfigureMachines();
        admin.canSupportSoftware();
        admin.buildSoftware();
        admin.makeCodeReviews();
        System.out.println();

        AutomationQA qa = new AutomationQA();

        qa.canVerifySoftwareQuality();
        qa.buildSoftware();
        qa.makeCodeReviews();
        System.out.println();

        ProdManager manager = new ProdManager();

        manager.canManagePeople();
        manager.canDrinkCoffee();
        manager.buildSoftware();
        manager.makeCodeReviews();
        System.out.println();

        CTO cto = new CTO();

        cto.buildSoftware();
        cto.makeCodeReviews();
        cto.canManagePeople();
        cto.canDrinkCoffee();
        cto.canVerifySoftwareQuality();
        cto.canConfigureMachines();
        cto.canSupportSoftware();
    }
}
