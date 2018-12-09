/*
Да се създаде клас ComputerDemo, с main метод.
В рамките на main метода да се създадат 2 обекта от тип Computer.
Да се зададат стойности на всеки от компютрите за year, price,
hardDiskMemory, freeMemory, operationSystem.Нека единият компютър да е
лаптоп. На единия от двата компютъра да се задели памет 100 (чрез
метода useMemory), а на другия, да се смени операционната система (чрез
метода changeOperationSystem), след което да се изведат на екрана всичките
полета на двата компютъра.
 */

package Homework3;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer desktopComputer = new Computer();
        desktopComputer.freeMemory = 512;
        desktopComputer.hardDiskMemory = 524288;
        desktopComputer.isNotebook = false;
        desktopComputer.operationSystem = "Debian 9.5";
        desktopComputer.price = 1899.99;
        desktopComputer.year = 2006;

        System.out.println("Desktop Computer is manufactured: " + desktopComputer.year + " year");
        System.out.println("The HardDisk size is: " + desktopComputer.hardDiskMemory + " Megabytes");
        System.out.println("The free memory is: " + desktopComputer.freeMemory + " Megabytes");
        System.out.println("The Desktop Computer has: " + desktopComputer.operationSystem + " OS");
        System.out.println("The Sell Price of this Desktop Computer is: " + desktopComputer.price + " Leva");
        System.out.println("Is this a notebook or \t " + desktopComputer.isNotebook + " \t No it's not a notebook");

        System.out.println();

        Computer laptop = new Computer();
        laptop.freeMemory = 8162;
        laptop.hardDiskMemory = 1048576;
        laptop.isNotebook = true;
        laptop.operationSystem = "Windows 10 Pro";
        laptop.price = 2856.88;
        laptop.year = 2014;

        System.out.println("Laptop is manufactured: " + laptop.year + " year");
        System.out.println("The HardDisk size is: " + laptop.hardDiskMemory + " Megabytes");
        System.out.println("The free memory is: " + laptop.freeMemory + " Megabytes");
        System.out.println("The Laptop has: " + laptop.operationSystem + " OS");
        System.out.println("The Sell Price of this Laptop is: " + laptop.price + " Leva");
        System.out.println("Is this a notebook or \t " + laptop.isNotebook + " \t Yes it's a notebook");

        System.out.println();
        desktopComputer.useMemory(100);
        laptop.changeOperationSystem("Mac OS");

    }
}
