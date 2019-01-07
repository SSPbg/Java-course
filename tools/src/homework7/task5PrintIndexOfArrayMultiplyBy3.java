package Homework7;

public class task5PrintIndexOfArrayMultiplyBy3 {
    public static void main(String[] args) {

        double[] array = new double[10];

        for (double i = 0; i < array.length; i++) {
            array[(int) i] = i * 3;
            System.out.println(array[(int) i] + " ");
        }
    }
}
