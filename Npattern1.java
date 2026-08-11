import java.util.Scanner;
class  Npattern1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input");
		int n=sc.nextInt();
		int num=1;
		
		for(int i=1;i<=n;i++){
			
			
				if(i%2==0){
					for(int j=n;j>=n;j++){
					System.out.print(num) ;
					num--;
					
					}
				}
				else{
						for(int j=1;j<=n;j++){
					System.out.print(num);
					num++;
					
						}
				} 
				System.out.println();
				
				}
				
				
			}
				
				
		
		}
		
	

