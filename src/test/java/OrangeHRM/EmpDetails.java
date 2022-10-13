package OrangeHRM;

public enum EmpDetails {
    ID("id",2),
    FIRST_MIDDLE_NAME("First (& Middle) Name",3),
    LAST_NAME("Last Name",4),
    JOB_TITLE("Job Title",5),
    EMP_STATUS("Employment Status",6),
    SUB_UNIT("Sub Unit",7),
    SUPERVISOR("Supervisor",8);



 private int column;
    private String name;
    private String index;

    EmpDetails(String name , int column) {
        this.name = name;this.column = column;
    }


    public String getHeaderName() {
        return name;
    }

    EmpDetails(int coloum) {
        this.column = column;
    }


    public int getColoumn() {
        return column;
    }

    public String getIndex() {
        return index;
    }
}
