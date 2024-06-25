//Print * in Floyd's format using for and while loop
public class Assignment15 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter an integer number");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            int num = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                    num++;
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer number");
        }
    }
}
