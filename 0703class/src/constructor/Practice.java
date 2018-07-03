package constructor;

public class Practice {
	//생성자. 사용이유: 인스턴스를 어떤 값으로 초기화한다. 
	public Practice() {
		name="noname";
	}
	//생성자 오버로딩(동일한 이름의 메소드가 2개 이상 있는 경우)
	public Practice(String arg) {
		name=arg;
	}
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	static {
		System.out.println("맨 처음 한번만 수행되는 내용"); 
	}
	
	{
		System.out.println("인스턴스를 만들 때 마다 수행되는 내용"); 
	}
	public void display()
	{
		String name="지역변수 name";
		System.out.println(this.name);// System.out.println(name); 지역변수 name
	}

	

}
