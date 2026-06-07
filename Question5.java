import java.util.*;

public class Question5{
    public static void main(String[]args){
        List<Integer> list= Arrays.asList(1,1,2,2,3,4,5,5,66,66,212,21,44,44,12,33,12,2,43,57,65);
        int max=list.stream()
                    .mapToInt(x->x)
                    .max()
                    .orElse(0);

        System.out.println("Max Number:"+max); 
         List<String> listWord=Arrays.asList("Java","Cat","apple","miss","phone","studio","rap","dact","of"); 
         String longestString=listWord.stream()
                                .max((a,b)->a.length()-b.length())
                                .orElse(null);
        System.out.println("Max String:"+longestString);                                 
    }
}