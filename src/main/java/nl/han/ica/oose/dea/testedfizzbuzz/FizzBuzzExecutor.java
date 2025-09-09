package nl.han.ica.oose.dea.testedfizzbuzz;

public class FizzBuzzExecutor {

    public String execute(int i) {
        if(i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0){
            return "Buzz";
        } else {
            return "" + i;
        }
    }
}
