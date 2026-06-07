import java.util.*;
import java.util.stream.Collectors;
public class Question3{
    public static void main(String[]args){
        List<Integer> list= Arrays.asList(1,1,2,2,3,4,5,5,66,66,212,21,44,44,12,33,12,2,43,57,65);
        List<Integer> sortedList=list.stream()
                                    .distinct()
                                    .sorted((a,b)->b.compareTo(a)) // sorted(Comparator.reverseOrder())
                                    .collect(Collectors.toList());

        System.out.println(sortedList);                            
    }
}