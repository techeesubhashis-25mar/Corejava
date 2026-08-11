class Reversenumber
{
	public static void main(String []args){
		System.out.println("enter input=");
		Scanner sc =new Scanner(System.in);
		int n =sc nextInt();
		int rev=0;
		while (n>0){
			digit=n%10;
			rev=rev*10+digit;
			n/=10;
			}
		System.out.println("reverse number=" +rev);
		}
}
