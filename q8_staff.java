abstract class Staff {
    protected int id;
    protected String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void displayDetails();
}

class OfficeStaff extends Staff {
    private String department;

    public OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class q8_staff {
    public static void main(String[] args) {
        int n = 2; 
        OfficeStaff[] officeStaffArray = new OfficeStaff[n];

        officeStaffArray[0] = new OfficeStaff(1, "Tushar", "HR");
        officeStaffArray[1] = new OfficeStaff(5, "Rohit", "IT");
       

        for (OfficeStaff staff : officeStaffArray) {
            staff.displayDetails();
            System.out.println();
        }
    }
}