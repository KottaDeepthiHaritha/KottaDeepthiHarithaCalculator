package Maven_oop.calculator;
import java.util.*;
public class App 
{
	public static void main( String[] args )
    {
		All all=new All();
		Add ad=new Add();
		Subtract su=new Subtract();
		Multiply m=new Multiply();
		Division d=new Division();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a,b values:"+" ");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Enter choice:\n1.Add 2.Subtract 3.Multiply 4.Division");
		int c=s.nextInt();
		switch(c){
			case 1:ad.disp();
			       System.out.println(ad.Add(a,b,"Addition"));
			       break;
			case 2:su.disp();
			       System.out.println(su.Subtract(a,b,"Subtraction"));
		           break;
			case 3:m.disp();
				   System.out.println(m.Multiply(a,b,"Multiplication"));
		           break;
			case 4: d.disp();
				   System.out.println(d.Division(a,b,"Division"));
		           break;
		    default:System.out.println("Invalid Choice");
		            break;
			
		}
    }
}
