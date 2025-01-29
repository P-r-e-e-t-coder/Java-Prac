import java.util.*;
class Compareab{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A = ");
int a = sc.nextInt();
System.out.print("Enter B = ");
int b = sc.nextInt();
if(a == b){
	System.out.println("Both Are Equal");
}
else{
	if(a < b){
	System.out.println("A is Less Than B");
	}
	else{
	System.out.println("A Is Greater Than B");
	}
}
}
}