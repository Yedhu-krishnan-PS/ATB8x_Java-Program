package TASK;
//16/09
// Difference between = and  ==?
public class Task003 {
    public static void main(String[] args) {
int a = 10;
boolean y = (10==15);
boolean c = (a==10);
        System.out.println(a);
        System.out.println(y);
        System.out.println(c);
    }
}
/*
"=" is assignment operator.
It assigns the value to the variable . e.g. int a = 10;.

 "==" is comparison operator.
 It compares value between two operands and its output is always a Boolean.(TRUE/FALSE)
e.g. System.out.println( a==10);
 */