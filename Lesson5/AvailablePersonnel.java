package Lesson5;

public abstract class AvailablePersonnel {
    // interface

    //attribute
    public String name;
    public String YearsOfService;
    public String WorkingBranch;
    public String BasicSalary;

    //contructor
    public AvailablePersonnel(String name, String YearsOfService, String WorkingBranch, String BasicSalary){
        this.name= name;
        this.YearsOfService= YearsOfService;
        this.WorkingBranch= WorkingBranch;
        this.BasicSalary= BasicSalary;

    }
    public abstract void printInformation();

    public abstract void setName(String name);

}
