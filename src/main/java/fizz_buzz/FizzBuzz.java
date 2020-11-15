package fizz_buzz;

import java.util.Collection;

public class FizzBuzz {
    public String say(Integer number) {
        if(number < 0){
            return "Negative Number Error";
        }
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
        String fizz = "Fizz";
        String buzz = "Buzz";
        String bang = "Bang";

        if(number < 0){
            return "Negative Number Error";
        }
        if(number % 4 == 0){
            if(number % 5 == 0){
                if(number % 11 == 0){
                    return fizz+buzz+bang;
                }
                return fizz+buzz;
            } else if(number % 11 == 0){
                return fizz+bang;
            }
            return fizz;
        } else if( number % 5 ==0){
            if(number % 11 == 0){
                return buzz+bang;
            }
            return buzz;
        } else if(number % 11 == 0){
            return bang;
        }
        return ""+number;
    }
}
