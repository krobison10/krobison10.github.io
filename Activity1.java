import java.util.*;
public class Activity1
{
    public static void main(String[] args)
    {
        //Solution using clone method
        int[] arr = new int[10];
        //Populate array
        for(int i = 0; i < arr.length; i++)
        {//will populate each element with it's index for simplicity
            arr[i] = i;
        }
        var Array = arr.clone();
        System.out.println(Arrays.toString(Array));

        //Now using my own solution
        int[] newArr = new int[10];
        for(int i = 0; i < newArr.length; i++)
        {
            newArr[i] = i;
        }
        var newArray = cloneArray(newArr);
        System.out.println(Arrays.toString(newArray));
    }
    public static int[] cloneArray(int[] theArray)
    {
        int[] output = new int[theArray.length];
        for(int i = 0; i < theArray.length; i++)
        {
            output[i] = theArray[i];
        }
        return output;
    }
}
