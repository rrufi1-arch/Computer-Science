public class Employee {
    private String name;
    private String jobTitle;
    private int salary;

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public int getSalary() {
        return this.salary;
    }

    public String toString() {
        return "Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary;
    }

    public boolean equals(Employee other) {
        if (this.name.equals(other.name) && this.jobTitle.equals(other.jobTitle) && this.salary == other.salary) {
            return true;
        }
        return false;
    }

    public void raiseSalary(double percent) {
        this.salary = (int) (this.salary + (this.salary * percent/100));
    }

}