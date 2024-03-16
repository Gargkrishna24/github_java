package function;

public class Tables {
    public static void multiplicationTables(int number) {
        for (int index = 1; index <= 10; index++){
            System.out.println(number+" * "+index+" = " + index* number);
        }
    }

    public static void main(String[] args) {
        multiplicationTables(15);
    }
}
