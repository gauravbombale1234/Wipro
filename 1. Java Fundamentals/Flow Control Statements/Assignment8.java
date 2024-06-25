//Receive a color code from the user and print the color name:
public class Assignment8 {
    public static void main(String[] args) {
        char colorCode = args[0].charAt(0);
        switch (colorCode) {
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");
                break;
        }
    }
}
