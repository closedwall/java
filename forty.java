import java.util.Scanner;


public class forty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String triming, normalize;
        System.out.println("Enter the string");
        String str = sc.nextLine();
        triming = str.trim();
        System.out.println("the trimed string is: ");
        System.out.println(triming);

        //removing extra space in between the words
        normalize = (str.replaceAll("\\s+", " ")).trim();
        System.out.println(normalize);
        sc.close();
    }
}
