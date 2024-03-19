package function;

public  class ArmstrongNumber {
    public static void main(String[] args) {
        if(armstrongNumberCalculator(9474)){
            System.out.println("Given Number is Armstrong number");
        }else System.out.println("invalid number ");
    }

    public  static boolean armstrongNumberCalculator(int num){
        int temp = num;
        int result = 0;
        int n = count(num);
        while(num>0){
            int num2 = num%10;
            result = result + (int) Math.pow(num2,n);
            num = num/10;
        }

        return result==temp;
    }
    public static  int count(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
}
