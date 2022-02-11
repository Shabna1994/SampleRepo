package Multi;

public class SemTota extends Sem4 {


	public void totalaverage()
	{
		super.sem4mark();
		
	
		int avg=super.sem4total/4;
		System.out.println("Average of Four Sem :"+avg);
	}
	public static void main(String[] args) {
	
	SemTota obj=new SemTota();
	obj.totalaverage();
	
	}

}
