public class combinedTable {
    private singleTable t1, t2;
    public combinedTable(singleTable t1, singleTable t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    public boolean canSeat(int n){
        return (t1.getNumSeats()+t2.getNumSeats()) >= n;
    }
    public double getDesirability(){
        double avg = t1.getDesirability() + t2.getDesirability();
        if(t1.getHeight() == t2.getHeight()){
            return avg;
        }else{
            return avg-10;
        }
    }
}

