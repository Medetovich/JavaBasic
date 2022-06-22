package recource.Ls16;
// Это набор методов, которые должны реализовать
// наследники этого интерфейса
//Контракт, которому должны следовать все его дочерние классы
public interface AdvancedArrayList {
    void set(int index, int value);
    int get(int index);
    int size();
    void append(int value);
    void insert(int index, int value);
    void delete(int index);
    boolean contains(int value);
    void append(int [] array);
    void printAllElem();
}
