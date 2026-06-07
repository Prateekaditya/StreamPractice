import java.util.*;
import java.util.stream.Collectors;
public class Question1{
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(1,1,2,2,3,4,5,5,66,66,212,21,44,44,12,33,12,2,43,57,65);
        HashSet<Integer> set=new HashSet<>();

        List<Integer> uniqueElements=list.stream()
                                        .filter(set::add) // filter(e->set.add(e))
                                        .collect(Collectors.toList());

        System.out.println("Normal List:"+list);
        System.out.println("The List with onlu unique Element:"+uniqueElements);
    }
}