import java.util.Scanner;
public class checkEvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int n= s.nextInt();
        if(n%2==0)
         System.out.println("Number is even");
        else
         System.out.println("Number is odd");	
	}

}
