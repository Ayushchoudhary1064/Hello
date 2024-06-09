import java.util.*;
public class Leap_year {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter a year:");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}