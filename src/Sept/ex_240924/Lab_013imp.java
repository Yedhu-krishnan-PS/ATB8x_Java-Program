package Sept.ex_240924;

public class Lab_013imp {
    public static void main(String[] args) {
        String First_Name = "Yedhu";
        String last_name = "Krishnan";
        int a = 24;
        int b = 36;
        System.out.println(First_Name + last_name + a + b);
        System.out.println(First_Name + last_name + (a + b));
        System.out.println(a + b + First_Name + last_name );
// Having an integer in the beginning will add them,
// but if it is started with a String then integers won't be calculated
    }
}
