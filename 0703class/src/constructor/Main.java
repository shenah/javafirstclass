package constructor;

public class Main {

	public static void main(String[] args) {
		Practice practice1= new Practice();
		//practice1.setName("noname"); 이걸 생성자로 초기화
		System.out.println(practice1.getName());
		
		Practice practice2= new Practice();
		//practice2.setName("noname");
		System.out.println(practice2.getName());
		
		Practice practice3= new Practice("park");
		System.out.println(practice3.getName());
		
		String str="Hello World"; 
		int r=str.lastIndexOf("o");
		System.out.println(r);
		
		practice3.display();
	}

}
