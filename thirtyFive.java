import java.util.Scanner;
//programm to compare to string
public class thirtyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings to compare: ");
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("Comparing without ignoring case: "+str.equals(str2));
        System.out.println("Comparing the strings by ignoring case: "+str.equalsIgnoreCase(str2));

        
    }
}
