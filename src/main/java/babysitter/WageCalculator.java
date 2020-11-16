package babysitter;

public class WageCalculator {
    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        int wage = 0;

        if(startingHour < bedtime) {
            if (endingHour < bedtime && endingHour > startingHour) {
                wage = (endingHour - startingHour) * 12;
            } else if (endingHour > bedtime && endingHour > 17) {
                wage = ((bedtime - startingHour) * 12) + ((endingHour - bedtime) * 8);
            } else {
                wage = ((bedtime - startingHour) * 12) + ((24 - bedtime) * 8) + (endingHour * 16);
            }
        } else if(startingHour > bedtime){
            if(endingHour < 24){
                wage =(endingHour - startingHour)*8;
            }else{
                wage = (24 - startingHour)*8 + endingHour*16;
            }
        }
        return wage;
    }
}
