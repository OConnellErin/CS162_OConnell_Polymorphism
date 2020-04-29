import java.util.ArrayList;

public class Owner extends Employee {
    ArrayList<Employee> owner = new ArrayList<>();

    public Owner() {
    }

    public void addEmployee(Employee employee) {
        owner.add(employee);
    }

    @Override
    public String toString() {
        return "" + owner;
    }

    public void giveRaise(Class<?> Employee, double raisePercentage) {
        //enhanced for loop
//        for (Employee item:owner) {
  //          Class<? extends Employee> type = item.getClass();
//            if (Employee.getClass().equals("Engineer"){
                //make a call here that sets the baseSalary the the raisePercentage * the current Salary
//            }
//            }
//        }
    }
}

