import java.util.*;

public class While_Loop {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int spam = 1;
        System.out.println("Enter how many integer to spam!");
        int amount = s.nextInt();

        do {
            System.out.println(spam);
            spam++;
        }
        while(spam<amount);
    }
}