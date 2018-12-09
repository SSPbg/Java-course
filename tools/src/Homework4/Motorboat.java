
/*
Motorboat is a separate object.
Every motorboat must have year and price, and 2 actions - leaveShip and getInShip.

Create constructors with all the fields of the two objects.
Create 2 Ships with their motorboats.
Make the motorboats leave and get in ship. Make the ships run fast, after that run slow and finally park.
 */
package Homework4;

public class Motorboat {
    private int year;
    private int price;


    public Motorboat(int year, int price) {
        this.year = year;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void leaveShip() {
        System.out.println("Motorboat go out to open sea for a short training!");
    }
    public void getInShip() {
        System.out.println("Motorboat get back in the ship after the short training!");
    }
}
