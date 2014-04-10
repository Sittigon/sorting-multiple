package th.co.geniusthee.training.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

   public static List<String> sort(List<String> numbers) 
   {

       Collections.sort(numbers, new Comparator<String>() 
       {

           public int compare(String o1, String o2) 
           {
               return multiplePointCompare(o1, o2);
           }
       });

       return numbers;
   }

   
   private static int multiplePointCompare(String str1, String str2) {
    //try {
        String[] split1 = str1.split("\\.");
        String[] split2 = str2.split("\\.");
 
        int length = (split1.length > split2.length) ? split1.length : split2.length;
 
        for (int i = 0; i < length; i++) {
            int numb1;
            try {
                numb1 = Integer.parseInt(split1[i]);
            } catch (Exception ex) {
                return -1;
            }
 
            int numb2;
            try {
                numb2 = Integer.parseInt(split2[i]);
            } catch (Exception ex) {
                return 1;
            }
 
            if (numb1 > numb2) {
                return 1;
            }
 
            if (numb1 < numb2) {
                return -1;
            }
        }
 
        return 0;
    }
} 

