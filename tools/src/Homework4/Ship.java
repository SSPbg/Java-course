/*
Build a Ship. Every ship must have length, width, name, year, price and motorboat.
It can move fast in sea, move slow, and park on the coast.

Motorboat is a separate object.
Every motorboat must have year and price, and 2 actions - leaveShip and getInShip.

Create constructors with all the fields of the two objects.
Create 2 Ships with their motorboats.
Make the motorboats leave and get in ship. Make the ships run fast, after that run slow and finally park.
 */
package Homework4;

public class Ship {

    private String name;
    private double length;
    private double width;
    private int year;
    private double price;
    private String motorboat;

    public Ship() {

    }
    public Ship(String name, double length, double width, int year, double price, String motorboat) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.year = year;
        this.price = price;
        this.motorboat = motorboat;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMotorboat() {
        return motorboat;
    }

    public void setMotorboat(String motorboat) {
        this.motorboat = motorboat;
    }

    public void fast() {
        System.out.println(name + " is moving faster in the sea!");
    }

    public void slow() {
        System.out.println(name + " is moving slowly in the sea!");
    }
    public void park() {
        System.out.println(name + " is parking on the coast!");
    }
}
