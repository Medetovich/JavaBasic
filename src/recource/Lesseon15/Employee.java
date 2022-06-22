package recource.Lesseon15;

abstract public class Employee {
    public static int id;
    String name;
    String company;
    int baseSalary;
    public abstract boolean realize();


    public int getSalary(){
        return baseSalary;
    }


    public Employee(String name, String company, int baseSalary){
        this.name = name;
        this.company = company;
        this.baseSalary = baseSalary;

    }

    public int getId() {
        return id++;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
