package pack1;

public class StringBufferEg {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb.append(" java"));  //hello java
		

		System.out.println("insert");
		sb.insert(5,"hai");			//hellohai java
		System.out.println(sb);  

		System.out.println("delete");
		sb.delete(5,8);				//hello java
		System.out.println(sb);  

		
		System.out.println("replace");
		sb.replace(5,7,"world");	//helloworldava
		System.out.println(sb);  

		System.out.println("reverse");
		sb.reverse();				//avadlrowolleh
		System.out.println(sb);  
	}

}
