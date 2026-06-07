import java.util.*;
import java.util.stream.Collectors;
public class Question4{
    public static void main(String[] args){
        List<String> list=Arrays.asList("Java","Cat","apple","miss","phone","studio","rap","dact","of");
        List<String> sortedListLength=list.stream()
                                        .sorted(Comparator.comparing(String::length)) // (s1,s2)->Integer.compare(s1.length(),s2.length())
                                        .collect(Collectors.toList());
        System.out.println(sortedListLength);                            
    }
}