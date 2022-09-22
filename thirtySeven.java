import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class thirtySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<4;i++)
        {
            int temp = sc.nextInt();
            list.add(temp);

        }
        int value = list.indexOf(45);
        System.out.println("Element stored:"+value);

        sc.close();
    }
    
}