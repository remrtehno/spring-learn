package hibernate.one_to_many.entity;

import hibernate.one_to_many.Employee;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity(name = "Department")
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "min_salary")
    private int minSalary;

    public Department() {
    }

    public Department(String name, int maxSalary, int minSalary) {
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSalary=" + minSalary +
                '}';
    }


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private List<Employee> employees;


    public void addEmpToDepartment(Employee employee){
        if(employees == null){
            employees = new ArrayList<Employee>();
        }
        employees.add(employee);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }
}