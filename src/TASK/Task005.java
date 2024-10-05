package TASK;
//16/09
/*Another byte b = 10; byte c = 10;
 What is the answer if we perform b+c, What is the data type it will give in result.*/

public class Task005 {
    public static void main(String[] args) {
        byte b = 10;
        byte c = 10;
        int a = b+c;
        System.out.println(a);
      /*  As per java rules Byte + Byte = int,
        so if Byte b = 10 and Byte c = 10 then the answer 20 is stored in int.*/


        // Extra info
        char k = 'A';
        char l = 'B';
        int m = k+l;
        System.out.println(m);
    }
}
/*     Extra tip: concatenation of two characters gives you the sum of the value of the characters   */
