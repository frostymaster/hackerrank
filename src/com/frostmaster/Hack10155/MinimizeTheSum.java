package com.frostmaster.Hack10155;

public class MinimizeTheSum {

    // Complete the minimumSum function below.
    static long minimumSum(int[] l, int[] r) {
        int[] newArr = new int[l.length];
        for(int i = 0; i < l.length - 1; i++){
            int maxFirst = 0;
            int maxLast = 0;
            int maxFirst2 = 0;
            int maxLast2 = 0;
            if(l[i] > r[i]){
                maxFirst = l[i];
                maxLast = r[i];
            } else {
                maxFirst = l[i];
                maxLast = r[i];
            }
            if(l[i+1] > r[i+1]){
                maxFirst2 = r[i+1];
                maxLast2 = l[i+1];
            } else {
                maxFirst2 = l[i+1];
                maxLast2 = r[i+1];
            }
            if((maxLast >= maxFirst2) && (maxLast <= maxLast2)){
                newArr[i] = maxLast;
                newArr[i+1] = maxLast;
                i++;
                if(i == l.length)
                    break;
            } else{
                newArr[i] = maxFirst;
            }
        }

        int sum = 0;
        for(int i = 0; i < newArr.length - 1; i++){
            int diff = Math.abs(newArr[i] - newArr[i+1]);
            sum += diff;
        }

        return sum;
    }

}
