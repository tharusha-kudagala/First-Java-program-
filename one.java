import java.util.Scanner;

class one{
	public static void main(String[] args) {
		float ans=0;
		Scanner input= new Scanner(System.in);

		System.out.print("Enter the first value : ");
		float num1 = input.nextFloat();
		
		System.out.println("Please select the operator [+][-][*][/]");
		char opera = input.next().charAt(0);
		
		if(opera != '+' && opera != '-' && opera != '*' && opera != '/'){
			System.out.println("Invalid Operator");
			System.exit(0);
		}

		System.out.print("Enter the second value : ");
		float num2 = input.nextFloat();
		
		if(opera == '+'){
			ans = num1 + num2;
		}
		else if(opera == '-'){
			ans = num1 - num2;	
		}
		else if(opera == '*'){
			ans = num1 * num2;
		}
		else if(opera == '/'){
			ans = num1 / num2;
		}	

		System.out.println("The answer is "+ ans);
		
	}
}