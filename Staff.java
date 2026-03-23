public abstract class Staff implements IPayable {
    private String id;
    private String name;
    public Staff(String id,String name){
        this.id=id;
        this.name=name;      
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public abstract double getIPayableAmount();
    // phải thêm phương thức của implements
}
