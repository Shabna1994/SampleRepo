package Multi;



public class Sem4  extends Sem3
{
	int ss1=34;
	 int ss2=56;
	 int ss3=78;
	 int ss4=89;
		int sem4total;
		int x;
		
		public Sem4()
	{
		
			
		
	}
	public void sem4mark()
	{
		super.sem3mark();
		
		
		
		int total=ss1+ss2+ss3+ss4;
		int avg4=total/4;
		System.out.println("Avg mark of sem4 : "+avg4);
		sem4total=(super.sem3total)+avg4;
		System.out.println("Avg mark of first four sem : "+sem4total);
		
	}
	public static void main (String args[])
	{
		Sem4 obj=new Sem4();
		obj.sem4mark();
		
	}
	}

