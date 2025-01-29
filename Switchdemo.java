import java.util.*;
class Switchdemo{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Welcome To Greeting Center : \n1.English\n2.Gujarati\n3.Hindi\n4.Bhailang");
System.out.print("Press The Button Corresponding To The Language You Want To hear Greeting:-");
String a = sc.next();
switch(a){
case "1" : System.out.println("Hello, How are you?");
break;
case "2" : System.out.println("kem Cho Majama?");
break;
case "3" : System.out.println("Kaise ho Babuaa?");
break;
case "4" : System.out.println("Kya Bolti Bhidulog Sab Maska Naa?");
break;
default : System.out.print("Error: Invalid Button<Please Select A Valid Button>\nThank you");
}
}
}