import java.util.Scanner;

public class vacuum {

    public static void main(String[] args) {

        // getting input
        Scanner scan = new Scanner(System.in);
        String rawInput = scan.nextLine();
        String[] arr = rawInput.split("");

        // finding if it returns to the same spot
        int x = 0;
        int y = 0;
        for(int i = 0; i < arr.length; i++) {
            switch(arr[i]) {
                case "L":
                    x--;
                    break;
                case "R":
                    x++;
                    break;
                case "U":
                    y++;
                    break;
                case "D":
                    y--;
                    break;
                default:
                    return;
            }
        }

        System.out.println(x==0 && y==0);

    }

}
