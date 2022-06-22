package recource.Lesseon15;
//  Дочерний класс расширяет базовый класс
//  супер класс - базовый класс
public class OfficeEmployee extends Employee{
    @Override
    public boolean realize() {
        return false;
    }

    int monthlyBonus;
    String manager;

    public OfficeEmployee(String name, String company, int baseSalary, int monthlyBonus, String manager) {
        super( name, company, baseSalary);
        this.monthlyBonus = monthlyBonus;
        this.manager = manager;
    }
    public void introduce(){
        System.out.println(getId() + " Name is: " + getName() + ", Company: " + getCompany() + ", Bonus -" + monthlyBonus + ", Manager:  " + setManager("Gena"));
    }
    // аннотация оверрайд нужна чтобы проверить, что в базовом классе
    // есть функция с таким названием
    @Override
    public int getSalary(){
        return baseSalary + monthlyBonus;
    }
    public int getMonthlyBonus(){
        return monthlyBonus;
    }
    public String setManager(String manager){
        return manager;
    }
}
