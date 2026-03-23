public class Invoice implements IPayable {
    private String itemName;
    private int quantity;
    private double pricePerItem;
    public Invoice(String itemName, int quantity, double pricePerItem){
        this.itemName=itemName;
        this.quantity=quantity;
        this.pricePerItem=pricePerItem;
    }
    public String getName(){
        return itemName;
    }
    @Override
    public  double getIPayableAmount(){
        return quantity*pricePerItem;
    }
}
