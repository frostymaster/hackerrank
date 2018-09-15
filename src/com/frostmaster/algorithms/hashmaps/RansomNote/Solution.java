package com.frostmaster.algorithms.hashmaps.RansomNote;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < magazine.length; i++){
            if(map.containsKey(magazine[i])){
                Integer sum = map.get(magazine[i]);
                map.put(magazine[i], sum+1);
            } else {
                map.put(magazine[i], 1);
            }
        }

        for(int i = 0; i < note.length; i++){
            if(!map.containsKey(note[i])){
                System.out.print( "No");
            }

            int counter = map.get(note[i]) - 1;

            if(counter == 0){
                map.remove(note[i]);
            }else{
                map.put(note[i], counter);
            }
        }

        System.out.print("Yes");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }

}
