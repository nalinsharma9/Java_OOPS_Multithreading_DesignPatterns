package OOPS.Generics;


/*
Java documentation on generics
//https://docs.oracle.com/javase/tutorial/java/generics/index.html
*/


import java.util.Arrays;

public class CustomGenrericArrayList <T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenrericArrayList(){
//        this.data = new T[DEFAULT_SIZE];          //We cannot create an instance of generic type
        this.data = new Object[DEFAULT_SIZE];
    }


    public void add(T value){
        if(this.isFull()){
            this.resize();
        }
        data[size++] = value;
    }

    public T remove(){
        Object removedItem = data[size--];
        return (T)removedItem;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[size*2];

        //copy the current items in new array instance

        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
