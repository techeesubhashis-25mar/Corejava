class A
{
	static int i;
	static void m1(){
		System.out.println(i);
	}
	void m2(){
		System.out.println(i);
	}
}
class Test1
{
	public static void main(String[] args) 
	{
		A. m1();
		A a=new A();
			a.m2();
	}
}
