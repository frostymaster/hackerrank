package com.frostmaster.algorithms.CatsAndaMouse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            int distanceA = Math.abs(x - z);
            int distanceB = Math.abs(y - z);
            if(distanceA == distanceB)
                System.out.println("Mouse C");
            if(distanceA < distanceB)
                System.out.println("Cat A");
            if(distanceB < distanceA)
                System.out.println("Cat B");
        }
    }

}
