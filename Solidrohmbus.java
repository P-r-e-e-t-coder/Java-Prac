import java.util.*;
class Solidrohmbus{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number of Rows = ");
int a = sc.nextInt();
System.out.print("Enter Symbol/String/Number You Want To Make Pattern of = ");
String s = sc.next();
for(int i=1;i<=a;i++){
	for(int j=1;j<=a-i;j++){
		System.out.print(" ");
	}
	for(int j=1;j<=a;j++){
		System.out.print(s);
	}
	System.out.println();
}
}
}