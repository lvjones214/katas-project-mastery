package babysitter;

public class WageCalculator {
    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        int wage = 0;
        wage = (endingHour - startingHour)*12;
        return wage;
    }
}
