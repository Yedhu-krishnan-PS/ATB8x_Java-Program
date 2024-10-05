package TASK;

import java.io.PrintStream;

// 13TH SEP TASK
public class Task001 {
    public static void main(String[] args) {
        /*Write a program to print the table of number which user will give( int num 10)
output will be like this (by using the printf()
10 × 1 = 10
10 × 2 = 20
10 × 3 = 30….
10 × 10 = 100.

         */
       int num = 10;
        System.out.printf("%d x %d = %d" ,num,1,num*1);
        System.out.println();
        System.out.printf("%d x %d = %d" ,num,2,num*2);
        System.out.println();
        System.out.printf("%d x %d = %d" ,num,3,num*3);
        System.out.println();
        System.out.printf("%d x %d = %d" ,num,4,num*4);
        System.out.println();



    //   Ignore the following lines
        //    PrintStream printf1 = System.out.printf("%d x %d = %d" num, 5, num * 5);
     //   PrintStream printf = System.out.printf("%d x %d = %d" num, 10, num * 10);


    }
}
