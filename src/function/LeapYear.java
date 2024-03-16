package function;

public class LeapYear {
    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void main(String[] args) {
        boolean leap = isLeap(2014);
        System.out.println("leap = " + leap);

    }
}
