package babysitter;

public class WageCalculator {
    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        int wage = 0;
        int hours = 0;
        int payment = 0;

        if(startingHour < bedtime) {
            if (endingHour < bedtime && endingHour > startingHour) {
                hours = endingHour - startingHour;
                wage = hours * 12;
            } else if (endingHour > bedtime && endingHour > 17) {
                wage = ((bedtime - startingHour) * 12) + ((endingHour - bedtime) * 8);
                hours = (bedtime - startingHour) + (endingHour - bedtime);
            } else {
                wage = ((bedtime - startingHour) * 12) + ((24 - bedtime) * 8) + (endingHour * 16);
                hours = (bedtime - startingHour) + (24 - bedtime) + endingHour;
            }
        } else if(startingHour > bedtime){
            if(endingHour < 24 && endingHour > 17){
                hours = endingHour - startingHour;
                wage =hours*8;
            }else{
                wage = (24 - startingHour)*8 + endingHour*16;
                hours = (24 - startingHour) + endingHour;
            }
        }
        if(wage < 9* hours){
            payment = 9 * hours;
        } else {
            payment = wage;
        }
        return payment;
    }
}
