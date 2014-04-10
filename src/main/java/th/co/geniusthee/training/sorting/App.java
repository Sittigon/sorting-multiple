package th.co.geniusthee.training.sorting;
import java.util.Arrays;
import java.util.List;

public class App {

   private static final String[] question = {
       "1.",
       "2",
       "2.3.5.7",
       "6.1.2",
       "3.6",
       "0",
       "1.1.1.4",
       "11.0",
       "10.2.5",
       "3.6.5.1.8",
       "99.3.5.1.2.5.7.9",
       "98.6.25.5.811"
           
   };

   private static void print(List<String> numbers) {
       for (String number : numbers) {
           System.out.println(number);
       }
       
       System.out.println("------------------------------------------------");
   }

   public static void main(String[] args) {
       List<String> numbers = Arrays.asList(question);
       print(numbers);
       numbers = Sorting.sort(numbers);
       print(numbers);
   }
}


