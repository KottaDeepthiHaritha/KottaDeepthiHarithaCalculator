package Maven_oop.calculator;
public class Division extends All{
	String name;
	public int Division(int a,int b,String n) {
		this.name=n;
		return(a/b);
	}
	public void disp() {
		System.out.println("Ater Division operation:");
		
	}
}
