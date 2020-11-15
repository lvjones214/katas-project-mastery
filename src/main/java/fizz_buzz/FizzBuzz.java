package fizz_buzz;

import java.util.Collection;

public class FizzBuzz {
    public String say(Integer number) {
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        if(number % 3 == 0){
            return "Fizz";
        }
        if(number % 5 == 0){
            return "Buzz";
        }
        return ""+number;
    }
    public String fizzBuzzList(Integer numberLower, Integer numberUpper){
        int n = numberLower;
        String answer = "";
        String wordList = "";
        while(n <= numberUpper){
            answer = say(n);
            n++;
            wordList = wordList + " " + answer;
        }
        return wordList;
    }

    public String sing(Integer number) {
        if(number % 4 == 0  && number % 5 == 0){
            return "FizzBuzz";
        }
        if(number % 4 == 0 && number % 11 == 0){
            return "FizzBang";
        }
        if(number % 5 == 0 && number % 11 == 0){
            return "BuzzBang";
        }
        if(number % 4 == 0){
            return "Fizz";
        }
        if(number % 5 == 0){
            return "Buzz";
        }
        if(number % 11 == 0){
            return "Bang";
        }
        return ""+number;
    }
}
