package method;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("닉네임:");
		String nickname=sc.nextLine();
		Member member1=new Member();
		member1.setNickname(nickname);
		member1.setPassword("1234");
		member1.setEmail("shen_aihua0126@naver.com");
		member1.setAge(18);
		sc.close();
		
		//member1.display();
		System.out.println(member1);
		
		System.out.println(Member.sum(10,30));
		System.out.println(Member.sum(10,30,20));
		System.out.println(Member.sum(10));
		system.out.println(Member.sum(40,50,60,70));
		}
}
