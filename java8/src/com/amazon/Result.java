package com.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Result {

	 /*
     * Complete the 'minimalHeaviestSetA' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
    // Write your code here
    	List<Integer> finalArrA = new ArrayList<>();
        List<Integer> tempFinalArrA = new ArrayList<>();
        Integer sumFinalA = 0;
        Collections.sort(arr);
        System.out.println("Sorted list = " + arr);
        System.out.println("list size = " + arr.size());
        for (int i = arr.size()-1; i>0; i--){
            System.out.println("i = " + i);
            List<Integer> arrA = arr.subList(i, arr.size());
            System.out.println("arrA = " + arrA);
            List<Integer> arrB = arr.subList(0, i);
            System.out.println("arrB = " + arrB);
            Integer sumA = arrA.stream().reduce(0,Integer::sum);
            System.out.println("sumA = " + sumA);
            Integer sumB = arrB.stream().reduce(0,Integer::sum);
            System.out.println("sumB = " + sumB);
            if (sumA>sumB & arrA.stream().noneMatch(a -> arrB.contains(a))){
                tempFinalArrA = arrA;
                System.out.println("tempFinalArrA = " + tempFinalArrA);
            }
            if (finalArrA.size() == 0){
            finalArrA = tempFinalArrA;
             System.out.println("finalArrA after finalArrA.size() = " + finalArrA);
           
            }
             sumFinalA = finalArrA.stream().reduce(0,Integer::sum);
             System.out.println("sumFinalA = " + sumFinalA);
             if (tempFinalArrA.size()<finalArrA.size() && sumA>=sumFinalA){
                finalArrA = tempFinalArrA;
                 System.out.println("finalArrA after first else if = " + finalArrA);
            }
             if (tempFinalArrA.size()==finalArrA.size() && sumA>sumFinalA){
                finalArrA = tempFinalArrA;
                 System.out.println("finalArrA after second else if = " + finalArrA);
            }
        }
        System.out.println(finalArrA);
        return finalArrA;
    
}
}
