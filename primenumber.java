import java.util.Scanner;
class Primenumber
{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out .println("ENTER INPUT =");
		int n=sc.nextInt();

	boolean flag=true;
	for (int i=2;i<=n/2;i++){
		if (n%i==0){
			flag=false;
			break;
		}
	}
	
	if (flag  && n>=2){
	System.out .println("prime number");}
	else{
	System.out.println("not prime number");
	}
	} 
	
	
}

