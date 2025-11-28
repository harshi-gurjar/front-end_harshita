import java.util.*;

public class arrayunion{
    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        int arr2[] ={6,5,4,9};
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }

        for (int i=0;i<arr2.length;i++){
           if (list.contains(arr2[i])) { 
            list.add(arr2[i]);
            }
           
        }
        System.out.println(list);


    }}