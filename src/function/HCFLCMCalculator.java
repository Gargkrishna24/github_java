package function;

public class HCFLCMCalculator {
    public static void main(String[] args) {
        HCFLCMCalculator hcflcmCalculator = new HCFLCMCalculator() ;
        int lcm = hcflcmCalculator.lcm(78, 65);
        System.out.println("lcm = " + lcm);
        int hcf = hcflcmCalculator.hcf(100, 21);
        System.out.println("hcf = " + hcf);
    }

    public int hcf(int num1, int num2) {
        while (num2 > 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public int lcm(int num1, int num2) {
        int hcf = hcf(num1, num2);
        return (num1 * num2) / hcf;
    }
}


