/*here is multilevel inheritance(Interface1->Interface2->SampleClass1)
Object of the Interface2 is created and interface has no constructor 
hence constructor/class name is called
*/
package MultiInheriwithInterface;

public class SampleClass1 implements Interface2 {
	
		public void display()
		{
			
			System.out.println("Interface 1");
		}
		public void add()
		{
			
			System.out.println("Interface 2");
		}
		
		
		public static void main(String[] args) {
			
			Interface2 obj=new SampleClass1();
			obj.display();
			obj.add();	
		}
	}


