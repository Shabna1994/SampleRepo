package inherit;

	class Child extends  Parent
	{
	public void sum()
	{
		int c=a+b;
		System.out.println("Sum :"+c);
		
	}
	public void sub()
	{
		int d=a-b;
		System.out.println("Sub :"+d);
		
	}

	public static void main(String[] args) {
	
		Child obj=new Child();
		obj.display();
		obj.sum();
		obj.sub();
		
	}

}


