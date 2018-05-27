package com.frostmaster.WorldCodeSprint13.GroupFormation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

     static class Group {
         int f;
         int s;,
         int t;
         ArrayList<Student> students;

         Group(){
             this.f = 0;
             this.s = 0;
             this.t = 0;
             students = new ArrayList<>();
         }
     }

     static class Student {
         String name;
         int grade;
         Group group;
     }

    // Complete the membersInTheLargestGroups function below.
    static void membersInTheLargestGroups(int n, int m, int a, int b, int f, int s, int t) {
        HashMap<String, Student> students = new HashMap<>();

        for(int i = 0; i < n; i++){
            String student = scanner.nextLine();
            String[] studentAndGrade = student.split(" ");
            Student studentObject = new Student();
            studentObject.grade = Integer.parseInt(studentAndGrade[1]);
            studentObject.name = studentAndGrade[0];
            students.put(studentAndGrade[0], studentObject));
        }

        for(int i = 0; i < m; i ++){
            String studentLine = scanner.nextLine();
            String[] studentsToAdd = studentLine.split(" ");
            Student student1 = students.get(studentsToAdd[0]);
            Student student2 = students.get(studentsToAdd[1]);
            if(i == 0){
                Group group = new Group();
                group.students.add(student1);
                student1.group = group;
                students.put(student1.name, student1);
                countStudents(group, student1);
                group.students.add(student2);
                student1.group = group;
                students.put(student2.name, student2);
                countStudents(group, student2);
            } else {
                
            }
        }
    }

    public static void countStudents(Group group, Student student){
         if(student.grade == 1){
             group.f = group.f + 1;
         }
         if(student.grade == 2){
             group.s = group.s + 1;
         }
         if(student.grade == 3){
             group.t = group.t + 1;
         }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nmabfst = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nmabfst[0]);

        int m = Integer.parseInt(nmabfst[1]);

        int a = Integer.parseInt(nmabfst[2]);

        int b = Integer.parseInt(nmabfst[3]);

        int f = Integer.parseInt(nmabfst[4]);

        int s = Integer.parseInt(nmabfst[5]);

        int t = Integer.parseInt(nmabfst[6]);

        membersInTheLargestGroups(n, m, a, b, f, s, t);

        scanner.close();
    }

}
