import java.util.*;
class Numpyra{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number of Rows = ");
int a = sc.nextInt();
for(int i=1;i<=a;i++){
	for(int j=1;j<=a-i;j++){
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++){
		System.out.print(i + " ");
	}
	System.out.println();
}
}
}