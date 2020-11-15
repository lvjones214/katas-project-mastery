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
        if(number == 4){
            return "Fizz";
        }
        return ""+number;
    }
}
