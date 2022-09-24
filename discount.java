import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter name, price of product");
	     Scanner s= new Scanner(System.in);
         String name=s.next();
         float price=s.nextFloat(), discount;
         if(price>2000)
        	 discount=(float) (0.1*price);
         else
        	 discount=(float) (0.07*price);
         System.out.println("Discount of product "+name+" is:"+discount);
	}

}
