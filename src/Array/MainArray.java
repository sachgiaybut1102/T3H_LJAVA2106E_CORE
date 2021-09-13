package Array;

import java.util.Random;

public class MainArray {
    public static void main(String[] agrs) {
        myTowDimensionalArray();
    }

    static void myTowDimensionalArray() {
        Random random = new Random();

        int[][] array = new int[][]{
                {random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt()},
                {random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt()},
                {random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt()},
                {random.nextInt(), random.nextInt(), random.nextInt()}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }

            System.out.println();
        }
    }

    static void myArray() {
        int[] array = new int[]{21, 323, 434, 55, 23, 67, 87, 22};

        for (int i = 0; i < array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }
}
