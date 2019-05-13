package by.javatr.task2.runner;
import by.javatr.task2.util.Bubble;

public class Run {

    /**
     * Метод выводяший массив на экран
     */
    private static void printArr(int[][] arr){
        for (int j=0;j<arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = new int[4][];
        arr[0] = new int[]{1, 3, 4, 6};
        arr[1] = new int[]{7, 8};
        arr[2] = new int[]{2, 4, 7};
        arr[3] = new int[]{1, 8, 9};
        Bubble.bubbleSumDesk(arr);
        printArr(arr);
        Bubble.bubbleMaxAscending(arr);
        printArr(arr);
        Bubble.bubbleMaxDesk(arr);
        printArr(arr);
        Bubble.bubbleSumAscending(arr);
        printArr(arr);
        Bubble.bubbleMinAscending(arr);
        printArr(arr);
        Bubble.bubbleMinDesk(arr);
        printArr(arr);

    }
}
