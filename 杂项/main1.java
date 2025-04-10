public int findFreeBlock(int period, int duration){
    int space = 0;
    for(int i=1; i<= 60; ++i){
        if(isMinuteFree(period, i)) space++;
        else space = 0;
        if(space >= duration) return i-duration+1;
    }
    return -1;
}

public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
    for(int i = startPeriod; i <= endPeriod; ++i){
        int free=findFreeBlock(i, duration)
        if(free != -1){
            reserveBlock(i, free, duration);
            return true;
        }
    }
    return false;
}