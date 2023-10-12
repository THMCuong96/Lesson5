package Lesson5;

public class StaffOffice extends AvailablePersonnel {

    //contructor
    public StaffOffice (String name, String YearOfService, String WorkingBranch, String BasicSalary){
        super(name,YearOfService,WorkingBranch,BasicSalary);

    }
    @Override
    public void printInformation() {
        System.out.println("StaffOffice : " + name + " , " + YearsOfService + " , " + WorkingBranch + " ,  " + BasicSalary);
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}





