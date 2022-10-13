package ReflectionDemo;

public class reflectionBasic {
    private String name;
    private int id;

    public reflectionBasic(){
        this.name = "sukhjeet";
        this.id = 1;
    }

    public reflectionBasic(String name, int id){
        this.name = name;
        this.id= id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}
