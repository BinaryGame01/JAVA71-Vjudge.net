import java.util.Scanner;

public class B {
    public static void main(String S[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if(a>b){
            System.out.println("a > b");
        } else if (a<b) {
            System.out.println("a < b");
        } else if (a==b) {
            System.out.println("a=b");

        }
    }
}
