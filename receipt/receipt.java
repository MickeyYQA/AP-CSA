public class receipt{
    public static void main(String[] args){
        int subtotal = 38+48+30;
        double tax=subtotal * 0.08, tip=subtotal * 0.15;
        System.out.println("Subtotal:\n"+subtotal+"\n");
        System.out.println("Tax:\n"+tax+"\n");
        System.out.println("Tip:\n"+tip+"\n");
        System.out.println("Total:\n"+(subtotal+tax+tip));
        
    }
    
}