import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Your sum = ");    
        System.out.println((num*(num+1.0)/2.0));

        for(int i = 1; i<= 10 ; i++){
            System.out.print(num);
            System.out.print(" * ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.print(num*i);
            System.out.println();
        }    
    }
}
