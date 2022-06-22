package recource.Ls16;

public class MyArrayList implements AdvancedArrayList{
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(4);
        int[] qw = new int[]{12, 43, 21};
        myArrayList.set(0, 23);
        myArrayList.set(1, 45);
        myArrayList.set(2, 4);
        myArrayList.set(3, 3);
        System.out.println(myArrayList.size());
        myArrayList.append(qw);
        myArrayList.printAllElem();
       // MyArrayList list = new MyArrayList(qw);
        //System.out.println(list);

    }
    private int [] source;
    public MyArrayList(int initialSize){
        source = new int[initialSize];
    }



    public MyArrayList(int [] array){
        for (int i = 0; i < array.length; i++) {
            source[i] = array[i];
        }
    }

    @Override
    public void append(int[]array){
        int [] newArray = new int [array.length + size()];
        for (int i = 0; i < source.length; i++) {
            newArray[i] = source[i];
        }
        for (int i = source.length; i < array.length + size(); i++) {
            newArray[i] = array[i - source.length];
        }
        source = newArray;
    }
    @Override
    public void set(int index, int value) {
        source[index]=value;
    }

    @Override
    public int get(int index) {
        return source[index];
    }

    @Override
    public int size() {
        return source.length;
    }

    @Override
    public void append(int value) {
        int [] newSource = new int [size() + 1];
        for (int i = 0; i < source.length; i++) {
            newSource[i] = source[i];
        }
        newSource[size()] = value;
        source = newSource;

    }

    @Override
    public void insert(int index, int value) {
        int [] newSource = new int[size() + 1];
        if(index >= source.length){
            append(value);
        }
        else if (index < source.length){

            for (int i = 0; i < index; i++) {
                newSource[i] = source[i];
            }
            newSource[index] = value;
            for (int i = index + 1; i < newSource.length; i++) {
                newSource[i] = source[i-1];

            }}
        source = newSource;
    }

    @Override
    public void delete(int index) {
        int [] newSource = new int[size() - 1];
        int b = 0;
        if(index >= source.length){
            for (int i = 0; i < source.length; i++) {
                source[i]=newSource[i];}
        }else{
            for (int j = 0; j < source.length; j++) {
                if(index == j) {
                    continue;
                }
                newSource[b++] = source[j];
            }
            source = newSource;
        }
    }
    @Override
    public boolean contains(int value) {
        for (int i = 0; i < source.length; i++) {
            if(source[i] == value){
                return true;
            }
        }
        return false;
    }
    public void printAllElem(){
        for (int i = 0; i < size(); i++) {
            System.out.print(source[i] + " ");
        }
    }
}
