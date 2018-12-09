package Homework4;

public class ShipMotorboatDemo {
    public static void main(String[] args) {

        Motorboat kuku = new Motorboat(2005, 25000);
        Ship poseidon = new Ship("Poseidon", 159, 25 , 2000, 2500000,"Kuku");
        System.out.println("The name of the Ship is: " + poseidon.getName());
        System.out.println("Length of the ship: " + poseidon.getLength() + " meters");
        System.out.println("Width of the ship: " + poseidon.getWidth() + " meters");
        System.out.println("The years of manufacturing: " + poseidon.getYear());
        System.out.println("Price: " + poseidon.getPrice() + " $");
        System.out.println("Motorboat name: " + poseidon.getMotorboat());
        poseidon.fast();
        poseidon.slow();
        poseidon.park();
        kuku.leaveShip();
        kuku.getInShip();

        System.out.println();

        Motorboat ruku = new Motorboat(2005, 25000);
        Ship amm19 = new Ship("AMM19", 255.8, 49.2 ,1990, 950000,"Ruku");
        System.out.println("The name of the Ship is: " + amm19.getName());
        System.out.println("Length of the ship: " + amm19.getLength() + " meters");
        System.out.println("Width of the ship: " + amm19.getWidth() + " meters");
        System.out.println("The years of manufacturing: " + amm19.getYear());
        System.out.println("Price: " + amm19.getPrice() + " $");
        System.out.println("Motorboat name: " + amm19.getMotorboat());
        amm19.fast();
        amm19.slow();
        amm19.park();
        ruku.leaveShip();
        ruku.getInShip();

    }
}
