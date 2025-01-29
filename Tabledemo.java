import java.util.*;
class Tabledemo{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A Number You Want Table of = ");
int b = sc.nextInt();
System.out.println("Output of for loop:- ");
for(int i=1;i<11;i++){
System.out.println(b +"x" +i +"=" +b*i);
}
System.out.println("Output of While loop:- ");
int c=1;
while(c<11){
	System.out.println(b +"x" +c +"=" +b*c);
	c++;
}
System.out.println("Output of Do While loop:- ");
int d=1;
do{
	System.out.println(b +"x" +d +"=" +b*d);
	d++;
}while(d<11);
}
}