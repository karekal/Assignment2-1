import java.util.Scanner;
public class Assignment2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ag = new Scanner(System.in);
System.out.println("enter your age:");
int age=ag.nextInt();

if(age>18){
	System.out.println("you are eligible to vote");
}
else{
	System.out.println("sorry you are not eligible");
}
	}

}
