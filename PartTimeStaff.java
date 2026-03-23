public class PartTimeStaff extends Staff {
    private int workingHour;
    private double hourlyRate;
    public PartTimeStaff(String id, String name,int workingHour,double hourlyRate){
        super(id,name);
        this.workingHour=workingHour;
        this.hourlyRate=hourlyRate;
    }
    @Override
    public double getIPayableAmount(){
        return workingHour*hourlyRate;
    }
}
