/**
 * TODO Add In Class Summary
 * <p>
 * TODO Add In Class Description
 *
 * @author 11201174 <br />
 * Copyright 2020 Earthport Plc. All rights reserved.
 */
public class MoveNegativeArrayElementsAtLast_1
{
    public static void main(String[] args)
    {
        int[] arr = {3,-3,45,2,-19,-7,56,45};

        int len = arr.length;

        int[] out = new int[len];
        int j=0;
        for (int i = 0; i < len; i++)
        {
            if(arr[i]>=0){
                out[j]=arr[i];
                j++;
            }
        }
        for (int i=0;i<len;i++){
            if(arr[i]<0){
                out[j++]=arr[i];
            }
        }
        for (int i: out )
        {
            System.out.print(i+" ");
        }
    }
}
