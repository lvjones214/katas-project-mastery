package babysitter;

public class WageCalculator {
    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        int wage = 0;
        if(startingHour < bedtime && endingHour < bedtime){
            if(endingHour > 17 && endingHour < 24){
                wage = (endingHour - startingHour) * 12;
            } else if(startingHour < 17 && endingHour <17){
                wage = (endingHour-startingHour) * 16;
            }
        }
        if(startingHour > bedtime && endingHour < 24){
            wage = (endingHour - startingHour)*8;
        }
        return wage;
    }
}
