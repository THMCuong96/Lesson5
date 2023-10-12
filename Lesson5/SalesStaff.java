package Lesson5;

public class SalesStaff extends AvailablePersonnel{
    //Contructor

    public SalesStaff (String name, String YearOfService, String WorkingBranch, String BasicSalary){
        super(name,YearOfService,WorkingBranch,BasicSalary);

    }
    @Override
    public void printInformation() {
        System.out.println("SalesStaff : " + name + " , " + YearsOfService + " , " + WorkingBranch + " ,  " + BasicSalary);
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}
