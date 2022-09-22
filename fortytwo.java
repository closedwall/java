import java.util.Scanner;

//creating methords in java
public class fortytwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("the factorial of the given number is: "+factorial(num));
    }
    private static int factorial(int num){
        if(num==1)
        return 1;
        return num*factorial(num-1);
    }
}
