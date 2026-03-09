import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        if(a%2 != 0){
            for(int i = 0; i<a; i++){
                System.out.println("Even");
            }

        }else{
            for(int i = 0; i<a; i++){
                System.out.println("Odd");
            }
        }
    }   
}
