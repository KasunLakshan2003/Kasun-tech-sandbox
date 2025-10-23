import java.util.Scanner;
public class MyClass24{
	public static void main(String[]args){
		Scanner myscanner=new Scanner(System.in);
//input 1
		System.out.println("Enter the first number");
		int a=myscanner.nextInt();
//input 2
		System.out.println("Enter the second number");
		int b=myscanner.nextInt();
//input 3
		System.out.println("Enter the third number");
		int c=myscanner.nextInt();
//decision through nested if
		if(a>b){
			if(a>c){
				System.out.println("Max Is"+" "+a);
			}else{
				System.out.println("Max Is"+" "+c);
			}
			}else{
				if(b>c){
					System.out.println("Max Is"+" "+b);
				}else{
					System.out.println("Max Is"+" "+c);
				}}
			}
		}
