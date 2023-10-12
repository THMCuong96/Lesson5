package Lesson5;

public class TechnicalStaff extends AvailablePersonnel{
    //Contructor

    public TechnicalStaff (String name, String YearOfService, String WorkingBranch, String BasicSalary){
        super(name,YearOfService,WorkingBranch,BasicSalary);

    }
    @Override
    public void printInformation() {
        System.out.println("TechnicalStaff : " + name + " , " + YearsOfService + " , " + WorkingBranch + " ,  " + BasicSalary);
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}

