package recource.Ls17;

import recource.Ls16.AdvancedArrayList;

public class CustomArrayList implements AdvancedArrayList {
    private static final int INITIAL_CAPACITY = 4;
    private int size = 0;
    private int [] data;

    public CustomArrayList(){
        data = new int [INITIAL_CAPACITY];
    }
    @Override
    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public int get(int index) {
        return data[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void append(int value) {
        if (size == data.length)
            increaseCapacity();
        data[size++] = value;

    }
    private void increaseCapacity(){
        int [] newData = new int [data.length * 2];
        for (int i = 0; i < data.length; i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public void insert(int index, int value) {
        if (size == data.length)
            increaseCapacity();
        if (index >= size) {
            data[index] = value;
            size++;
        } else {
            for (int i = size + 1; i > index; i--) {
                data[i] = data[i-1];
            }
            data[index] = value;
            size++;

        }
    }
    @Override
    public void delete(int index) {
        if(index >= size){
            data[size] = 0;
            size--;
        }else{
            for (int i = index; i < size; i++) {
                data[i] = data[i+1];
            }
            size--;
        }

    }

    @Override
    public boolean contains(int value) {
        for(int i:data){
            if(i == value)
                return true;
        }
        return false;
    }

    @Override
    public void append(int[] array) {
        if (size <= data.length)
            increaseCapacity();
        for (int i = 0; i < array.length; i++) {
            data[i + size] = array[i];
        }
        size += array.length;
    }

    @Override
    public void printAllElem() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println();
    }
}
