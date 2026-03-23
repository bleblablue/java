import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double total=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        IPayable[] payablesList=new IPayable[n];

    for(int i = 0; i < n; i++){
        String line = sc.nextLine();
        String[] parts = line.trim().split("\\s+");
        String type = parts[0];

        if(type.equals("S")){
            String id = parts[1];
            String name = parts[2];
            int workingHour = Integer.parseInt(parts[3]);
            double hourlyRate = Double.parseDouble(parts[4]);

            payablesList[i] = new PartTimeStaff(id, name, workingHour, hourlyRate);

        }else if(type.equals("I")){
            String name = parts[1];
            int quantity = Integer.parseInt(parts[2]);
            double pricePerItem = Double.parseDouble(parts[3]);

            payablesList[i] = new Invoice(name, quantity, pricePerItem);
        }
    }   
        for(IPayable e: payablesList){
            if(e instanceof PartTimeStaff){
                total+=e.getIPayableAmount();
                PartTimeStaff p = (PartTimeStaff) e; //ép kiểu để có thể gọi getName vì implement không có phương thức này
                System.out.println("PartTimeStaff "+ p.getName()+" - Payment: "+e.getIPayableAmount());
            }else{
                total+=e.getIPayableAmount();
                Invoice p=(Invoice) e;
                System.out.println("Invoice "+p.getName()+" - Payment: "+e.getIPayableAmount() );          
            }
        }
        System.out.println("Total Payment = "+total);
    }
}
