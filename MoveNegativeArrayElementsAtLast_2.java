import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TODO Add In Class Summary
 * <p>
 * TODO Add In Class Description
 *
 * @author 11201174 <br />
 * Copyright 2020 Earthport Plc. All rights reserved.
 */
public class MoveNegativeArrayElementsAtLast_2
{
    public static void main(String[] args)
    {
        int[] arr = {3,-3,45,2,-19,-7,56,45};
        List<Integer> al = new ArrayList<>();
        for (int i : arr)
        {
            al.add(i);
        }
        List<Integer> al1 = new ArrayList<>();
        List<Integer> al2 = new ArrayList<>();
        al1 = al.stream().filter(i -> i >= 0).collect(Collectors.toList());
        al2 = al.stream().filter(i -> i < 0).collect(Collectors.toList());
        boolean b = al1.addAll(al2);
        System.out.println(al1);
    }
}
