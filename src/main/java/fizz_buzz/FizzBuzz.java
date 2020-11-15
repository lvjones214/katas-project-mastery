package fizz_buzz;

public class FizzBuzz {
    public String say(Integer number) {
        if(number == 3){
            return "Fizz";
        }
        if(number == 5){
            return "Buzz";
        }
        return ""+number;
    }
}
