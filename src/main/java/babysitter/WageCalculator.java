package babysitter;

public class WageCalculator {
    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        int wage = 0;
        if(startingHour < bedtime && endingHour < bedtime){
            wage = (endingHour - startingHour)*12;
        }
        if(startingHour > bedtime && endingHour < 24){
            wage = (endingHour - startingHour)*8;
        }
        return wage;
    }
}
