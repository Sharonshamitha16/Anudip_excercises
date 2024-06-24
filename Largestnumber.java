import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n = sc.nextInt();
        System.out.printf("Enter the second number:");
        int m = sc.nextInt();
        System.out.printf("Enter the third number:");
        int a = sc.nextInt();
        if(n>=m&&n>=a){
            System.out.printf(n+" is the greatest number");
        }
        else if(m>=n&&m>=a){
            System.out.printf(m+" is the greatest number");
        }
        else {
            System.out.printf(a+" is the greatest number");
        }

    }
}

