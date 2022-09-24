import java.util.Scanner;

public class fortyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("the length of "+str+" is:"+str.length());
        System.out.println("the length of "+str2+" is:"+str2.length());
        String concat = str+" "+str2;
        System.out.println("The concatenated string is: "+concat);
        sc.close();
    }
}
