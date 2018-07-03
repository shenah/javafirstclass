package method;

public class Member {

	private String nickname;
	private String password;
	private String email;
	private int age;
	
	public void setNickname(String arg) {
		nickname=arg;
	}
	public String getNickname() {
		return nickname;
	}
	public String getNicknam() {
		return nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//인스턴스 변수들을 출력해주는 메소드
	//클래스 안에서 클래스에 만들어진 변수를 사용할 때는 인스턴스나 클래스 이름을 기재하지 않습니다.
	public void display() {
		System.out.println("이메일:"+email+"\t"+"비밀번호:"+password
				+"\t"+"닉네임:"+nickname+"\t"+"나이:"+age+"\t");
	}
	@Override
	public String toString() {
		return "Member [nickname=" + nickname + ", password=" + password + ", email=" + email + ", age=" + age + "]";
	}
	public static int sum(int ... ar) {
		int tot=0;
		int len = ar.length;
		for(int i=0; i<len; i=i+1)
		{
			tot=tot+ar[i];
		}
		return tot;
	}

}
