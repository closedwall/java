import java.util.Scanner;

public class thirtyEight {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = "Programming is my Hobby";
        System.out.println("Enter the old string: ");
        String s = sc.nextLine();
        System.out.println("Enter the new string:");
        String ns = sc.nextLine();
        if(str.indexOf(s)==-1)
        System.out.println("The element which you want to replace doesn't exist:");
        else
        {
            str = str.replace(s,ns);
            System.out.println("Replaced string is:"+str);
        }
        sc.close();
    }
}
