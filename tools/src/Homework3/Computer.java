/*
Създайте клас Computer, който представя компютър.
Класът да има следните полета:
year – числова стойност показваща година на производство на компютъра
price – числова стойност (не е задължително да е цяло число) показваща
цената на компютъра
isNotebook – булева стойност – дали компютъра е преносим или не
hardDiskMemory – числова стойност за размера на хардиска
freeMemory – числова стойност показваща размера на свободната памет
operationSystem – текстово поле за операционната система на компютъра
Класът да дефинира следните методи:
-метод void changeOperationSystem(String newOperationSystem), който сменя
стойността на полето operationSystem със стойността подадена като
параметър.
-метод void useMemory(double memory), който намалява свободната памет
(freeMemory) със стойността подадена като аргумент.
Ако стойността на аргумента е по-голяма от свободната памет, извеждa съобщение "Not enough free memory!"
*/

package Homework3;

public class Computer {
    public int year;
    public double price;
    public boolean isNotebook;
    public int hardDiskMemory;
    public double freeMemory;
    public String operationSystem;

    public void changeOperationSystem(String newOperationSystem) {
        this.operationSystem = newOperationSystem;
        System.out.println("The new operation system is: " + newOperationSystem);
    }
    public void useMemory(double memory) {
        if (freeMemory < memory) {
            System.out.println("Not enough free memory!");
        } else {
            double remainingMemory = freeMemory - memory;
            System.out.println("This is the free memory: " + remainingMemory);

        }
    }
    public void notebookDetail(boolean notebook){
        this.isNotebook = notebook;
    }
}
