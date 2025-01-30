import java.util.*;

class Hollowrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number of Rows = ");
        int a = sc.nextInt();
        
        System.out.print("Enter Number of Column = ");
        int b = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Symbol/String/Number You Want To Make Pattern of = ");
        String s = sc.nextLine();
        
        int len = s.length();
        
       
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || i == a || j == 1 || j == b) {
                    System.out.print(s); 
                } else {
                    System.out.print(" ".repeat(len)); 
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
