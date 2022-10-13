package OrangeHRM;

public class UserData {
    private String empNumber;
    private String lastName;
    private String firstName;
    private String middleName;
    private String employeeId;

    private String index;

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getId() {
        return employeeId;
    }

  public String getIndex() {
        return index;
  }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

//    public void tableData() {
//        return  firstName + lastName;
//    }

}
