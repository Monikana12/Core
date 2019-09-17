package datastructure.array;

import java.util.ArrayList;
import java.util.Collections;

public class UniqueValue {

    //you are given an array of int
    //{1,3,2,2,3,7}
    //write code  to find the unique values of the array
    //1,2,3,7,10 -- should be the output
    //and sort the array

    public static void main(String[] args) {
        int [] array ={1,3,2,2,3,10,7,3};
        ArrayList arrayList =new ArrayList();
        for(int i =0;i<array.length;i++) {
            boolean isunique =false;
            for(int j=0;j<i;j++) {
                if(array[i]==array[j]) {
                    isunique =true;
                    break;
                }
            }

            if(!isunique) {
                arrayList.add(array[i]);
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);


    }
}
