package Computer;

public class HDD {
    private String name;
    private String size;
    private String type;

    public HDD() {
       name = "Default";
       size = "Default";
       type = "Default";
    }
    public HDD(String name, String size, String type){
        this.name = name;
        this.size = size;
        this.type = type;
    }
}
