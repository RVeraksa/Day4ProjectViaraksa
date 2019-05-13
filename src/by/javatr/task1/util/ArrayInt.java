package by.javatr.task1.util;
import java.util.Arrays;


public class ArrayInt {
    private int[] arr;

    public ArrayInt(int[] array) {
            this.arr = array.clone();
    }

    public ArrayInt(int length) {
        if (length >= 0) {
            this.arr = new int[length];
        }
        else if (length < 0) {
            this.arr = new int[Math.abs(length)];
        }
    }

    public ArrayInt() {
    }

    public int[] getArr() {
        return arr.clone();
    }

    public void setArr(int[] array) {
        if(this.arr.length == array.length) {
            this.arr = array;
        }
        else if (this.arr.length > array.length) {
            for (int i = 0 ; i<array.length; i++){
                addElement(i,array[i]);
            }
            for (int i = array.length; i<this.arr.length; i++){
                setZero(i);
            }
        }
        else if (this.arr.length < array.length){
            for (int i = 0 ; i<this.arr.length; i++){
                addElement(i,array[i]);
            }
        }
        else this.arr = null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ArrayInt arrayInt = (ArrayInt) obj;
        return Arrays.equals(arr, arrayInt.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public boolean checkNumber(int number){
        if ( number < 0 || number > arr.length-1 ){
            return false;
        }
        return true;
    }

    public void addElement(int number, int value){
        if (checkNumber(number)){
            this.arr[number] = value;
        }
    }

    public void setZero(int number){
        if (checkNumber(number)){
            this.arr[number] = 0;
        }
    }

    public int getElement(int number) {
        if (checkNumber(number)) {
            int b = this.arr[number];
            return b;
        }
        else
            return -1;
    }

    public int length(){
        int l  = arr.length;
        return l;
    }
}
