package by.javatr.task2.util;
import by.javatr.task2.function.Line;

public class Bubble {
    public static void bubbleMaxAscending(int[][] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (Line.maxElementLine(j,arr) > Line.maxElementLine(j+1,arr)) {
                    swap(j,(j+1), arr);
                }
            }
        }
    }

    public static void bubbleMaxDesk(int[][] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (Line.maxElementLine(j,arr) < Line.maxElementLine(j+1,arr)) {
                    swap(j,(j+1), arr);
                }
            }
        }
    }

    public static void bubbleMinAscending(int[][] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (Line.minElementLine(j,arr) > Line.minElementLine(j+1,arr)) {
                    swap(j,(j+1), arr);
                }
            }
        }
    }

    public static void bubbleMinDesk(int[][] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (Line.minElementLine(j,arr) < Line.minElementLine(j+1,arr)) {
                    swap(j,(j+1), arr);
                }
            }
        }
    }

    public static void bubbleSumAscending(int[][] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (Line.sumElementLine(j,arr) > Line.sumElementLine(j+1,arr)) {
                    swap(j,(j+1), arr);
                }
            }
        }
    }

    public static void bubbleSumDesk(int[][] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (Line.sumElementLine(j,arr) < Line.sumElementLine(j+1,arr)) {
                    swap(j,(j+1), arr);
                }
            }
        }
    }


    private static void swap(int one, int two, int[][] arr) {
        Object buf = arr[one];
        arr[one] = arr[two];
        arr[two] =(int[]) buf;
    }
}
