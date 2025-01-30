import java.util.*;
class Invhalfpyra{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number of Rows = ");
int a = sc.nextInt();
System.out.print("Enter Symbol/String/Number You Want To Make Pattern of = ");
String s = sc.next();
for(int i=a;i>0;i--){
	for(int j=1;j<=i;j++){
		System.out.print(s);
	}
	System.out.println();
}
}
}
