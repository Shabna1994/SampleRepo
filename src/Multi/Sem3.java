package Multi;

public class Sem3  extends Sem2
{
	int ss1=97;
	 int ss2=56;
	 int ss3=35;
	 int ss4=99;	

	  public int sem3total;
		
		public Sem3()
	{
		
			
	}
	public void sem3mark()
	{
		super.sem2mark();
		
		int total=ss1+ss2+ss3+ss4;
		int avg3=total/4;
		System.out.println("Avg mark of sem3 : "+avg3);
		sem3total=(super.sem2tot)+avg3;
		System.out.println("first 3 sem total "+sem3total);
	}
	public static void main (String args[])
	{
		Sem3 obj=new Sem3();
		obj.sem3mark();
	}
	}

