package q4;

public class Employee {
    private String emp_id;
    private String name;
    private String b_salary;
    private String grade;
    private String dept;


    public String getName() {    // accessor function to return name
        return this.name;
    }

    public void setName(String name) {   // setter function to set name
        if(name == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public void setId(String id) {   // setter function to set id
        this.emp_id= id;
    }

    public String getId() {  // accessor function to return id
        return this.emp_id;
    }

    public String getSalary() {  // accessor function to return salary
        return this.b_salary;
    }
    public void setSalary(String s) {    // setter function to set salary
        this.b_salary = s;
    }

    public String getGrade() {   // accessor function to return grade
        return this.grade;
    }
    public void setGrade(String c) { // setter function to set grade
        this.grade = c;
    }

    public void setDept(String d) {  // setter function to set department
        this.dept = d;
    }

    public String getDept() {    // accessor function to return department
        return this.dept;
    }

    @Override
    public String toString() {   // overriding toString function
        return (emp_id + "\t" + name + "\t" + b_salary + "\t" +  grade + "\t" + dept +  "\t\n");
    }
}