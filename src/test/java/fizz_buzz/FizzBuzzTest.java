package fizz_buzz;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Here are the rules for this kata:
 * <p>
 * -Write a method that takes an integer and returns a string. This represents the act of saying a number.
 * -The string should be the numerical characters that represent the value of the integer that was passed, EXCEPT:
 * -When the integer passed is a multiple of 3, the method should say Fizz.
 * -When the integer passed is a multiple of 5, the method should say Buzz.
 */
public class FizzBuzzTest {
    @Test
    public void whenGiven1FizzBuzzSays1() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(1);
        assertThat(spokenWord, is("1"));
    }

    @Test
    public void whenGiven2FizzBuzzSays2() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(2);
        assertThat(spokenWord, is("2"));
    }

    @Test
    public void whenGiven3FizzBuzzSaysFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(3);
        assertThat(spokenWord, is("Fizz"));
    }

    @Test
    public void whenGiven4FizzBuzzSays4() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(4);
        assertThat(spokenWord, is("4"));
    }

    @Test
    public void whenGiven5FizzBuzzSaysBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(5);
        assertThat(spokenWord, is("Buzz"));
    }

    @Test
    public void whenGiven6FizzBuzzSaysFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(6);
        assertThat(spokenWord, is("Fizz"));
    }

    @Test
    public void whenGiven10FizzBuzzSaysBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(10);
        assertThat(spokenWord, is("Buzz"));
    }

    @Test
    public void whenGiven15FizzBuzzSaysFizzBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(15);
        assertThat(spokenWord, is("FizzBuzz"));
    }

    @Test
    public void givenUpperAndLowerLimitsFizzBuzzReturnsList() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWordList = underTest.fizzBuzzList(1, 10);
        assertThat(spokenWordList, is(" 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz"));
    }

    @Test
    public void whenGiven12Or3FizzBuzzSings12Or3() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord1 = underTest.sing(1);
        assertThat(spokenWord1, is("1"));
        String spokenWord2 = underTest.sing(2);
        assertThat(spokenWord2, is("2"));
        String spokenWord3 = underTest.sing(3);
        assertThat(spokenWord3, is("3"));
    }

    @Test
    public void whenGiven4FizzBuzzSingsFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord1 = underTest.sing(4);
        assertThat(spokenWord1, is("Fizz"));
    }

    @Test
    public void whenGiven5FizzBuzzSingsBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord1 = underTest.sing(5);
        assertThat(spokenWord1, is("Buzz"));
    }

    @Test
    public void whenGiven8FizzBuzzSingsFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord1 = underTest.sing(8);
        assertThat(spokenWord1, is("Fizz"));
    }
    @Test
    public void whenGiven10FizzBuzzSingsBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord1 = underTest.sing(10);
        assertThat(spokenWord1, is("Buzz"));
    }
    @Test
    public void whenGiven20FizzBuzzSingsFizzBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord1 = underTest.sing(20);
        assertThat(spokenWord1, is("FizzBuzz"));
    }
    @Test
    public void whenGiven11FizzBuzzSingsBang(){
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord1 = underTest.sing(11);
        assertThat(spokenWord1, is("Bang"));
    }
    @Test
    public void whenGiven22FizzBuzzSingsBang(){
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord1 = underTest.sing(22);
        assertThat(spokenWord1, is("Bang"));
    }
}
