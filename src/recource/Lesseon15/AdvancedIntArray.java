package recource.Lesseon15;
import java.util.stream.Stream;

public class AdvancedIntArray {
    private int [] source;
    public AdvancedIntArray(int numberOfElements){
        source = new int[numberOfElements];
    }
    public void print(){
        for (int i = 0; i < source.length; i++) {
            System.out.println(source[i]);
        }
    }
    public int get(int index){
        return source[index];
    }

    public void set(int index, int value){
        source[index]=value;

    }
    public int size(){
        return source.length;

    }
    public void append(int value){
        int [] newSource = new int [size() + 1];
        for (int i = 0; i < source.length; i++) {
            newSource[i] = source[i];
        }
        newSource[size()] = value;
        source = newSource;

    }
    public void insert(int index, int value){
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
    public void delete(int index){
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
    public boolean contains(int value){
        for (int i = 0; i < source.length; i++) {
            if(source[i] == value){
                return true;
            }
        }
        return false;
    }
}
