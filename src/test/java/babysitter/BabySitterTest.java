package babysitter;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BabySitterTest {
    @Test
    public void oneHourPreBedTimeShouldPay12() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(17, 18, 20);
        assertThat(wage, is(12));
    }
    @Test
    public void twoHourPreBedTimeShouldPay24() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(17, 19, 20);
        assertThat(wage, is(24));
    }
    @Test
    public void oneHourPostBedTimeBeforeMidnightShouldPay8() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(21, 22, 20);
        assertThat(wage, is(8));
    }
    @Test
    public void oneHourPostBedTimeAfterMidnightShouldPay16() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(0, 1, 20);
        assertThat(wage, is(16));
    }
    @Test
    public void oneHourPreBedTimBeforeMidnightAndOneHourPostBedtimeBeforeMidnightShouldPay20() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(20, 22, 21);
        assertThat(wage, is(20));
    }
    @Test
    public void oneHourPreBedTimBeforeMidnightAndEndtimeAfterMidnightShouldPay68() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(20, 2, 21);
        assertThat(wage, is(68));
    }
}
