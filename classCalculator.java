package mypackage;

import java.util.Scanner;

public class classCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("******************* Basic Calculator *********************");
		do {
		System.out.println("please choose below option to perform arithmetic operation");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multipliction");
		System.out.println("4. Division");
		System.out.println("5. exit");
		System.out.println("enter your choice");
		int c=sc.nextInt();
		int n1,n2;
		switch(c) {
		case 1:
			System.out.println("enter the 2 numbers");
			n1=sc.nextInt();
			n2=sc.nextInt();
			int sum=n1+n2; 
			System.out.println("sum= "+sum);break;
		case 2:
			System.out.println("enter the 2 numbers");
			n1=sc.nextInt();
			n2=sc.nextInt();
			int sub=n1-n2;
			System.out.println("sub= "+sub);break;
		case 3:
			System.out.println("enter the 2 numbers");
			n1=sc.nextInt();
			n2=sc.nextInt();
			int mul=n1*n2;
			System.out.println("mul= "+mul);break;
		case 4:
			System.out.println("enter the 2 numbers");
			n1=sc.nextInt();
			n2=sc.nextInt();
			float div=(float)n1/n2;
			System.out.println("div= "+div);break;
		case 5:
			return;
		default:
			System.out.println("invalid choice");
			
		}
		}while(true);
	}

}
