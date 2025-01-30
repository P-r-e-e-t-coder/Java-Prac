import java.util.*;
class Invnumpat{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number of Rows = ");
int a = sc.nextInt();
for(int i=a;i>0;i--){
	for(int j=1;j<=i;j++){
		System.out.print(j);
	}
	System.out.println();
}
}
}
