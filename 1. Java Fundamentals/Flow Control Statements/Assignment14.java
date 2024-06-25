//Print the sum of all the digits of a given number:
public class Assignment14 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
