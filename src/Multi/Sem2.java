package Multi;



public class Sem2  extends Sem1
{
	int ss1=34;
	 int ss2=26;
	 int ss3=48;
	 int ss4=89;
	 int x;
		
	 int sem2tot;
		public Sem2()
	{
		
			
		
	}
	public void sem2mark()
	{
		super.sem1mark();
		
		int total=ss1+ss2+ss3+ss4;
		int avg2=total/4;
		System.out.println("Avg mark of sem2 : "+avg2);
		
	
		sem2tot=(super.avg1)+avg2;
		System.out.println("semtotal :"+sem2tot);
	}
	public static void main (String args[])
	{
		
		Sem2 obj=new Sem2();
		obj.sem2mark();
		
	}
	}

