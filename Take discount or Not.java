import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];
            int dis=0;
            int res=0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                res+=a[i];
                dis+=Math.max(a[i]-y,0);
            }
            if(dis+x<res){
                System.out.println("COUPON");
            }
            else{
               System.out.println("NO COUPON");
            }
            
        }
    }
}
