package Employee;

public class SumOfDigits {
    public static void main(String[] args) {

        int m = 0;
        int n = 9999;
        int n1 = 1;

        for (int i = m; i <= 9999; i++) {
            int sum = 0;

            int temp = i;
            while (temp > 0) {
                int rev = temp % 10;
                sum = sum + rev;
                temp = temp / 10;
            }

            while (sum >= 10) {
                int newSum = 0;
                int tempSum = sum;
                while (tempSum > 0) {
                    int rev = tempSum % 10;
                    newSum = newSum + rev;
                    tempSum = tempSum / 10;
                }
                sum = newSum;
            }

            if (sum == 9 ) {
                System.out.println("digits are " + i);
                System.out.println("sum is " + sum);
            }
        }
    }
}
