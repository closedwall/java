import java.util.Scanner;
// programme to split the string in java
public class thirtyNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] arrstr = str.split("a",5);
        for(String a: arrstr)
        {
            System.out.println(a);
        }
    }
}
