package by.javatr.task2.function;

public class Line {
    public static int maxElementLine(int line, int[][] a){
        int[] b = a[line];
        int max = b[0];
        for (int i = 0 ; i < b.length-1; i++){
            if (b[i] < b[i+1])
                max = b[i+1];
        }
        return max;
    }

    public static int sumElementLine(int line, int[][] a){
        int[] b = a[line];
        int sum = 0;
        for (int i = 0 ; i < b.length; i++){
            sum += b[i];
        }
        return sum;
    }

    public static int minElementLine(int line, int[][] a){
        int[] b = a[line];
        int min = b[0];
        for (int i = 0 ; i < b.length-1; i++){
            if (b[i] > b[i+1])
                min = b[i+1];
        }
        return min;
    }
}
