package my.git.test;

public class StudentTest {
	public static void main(String[] args) {
		//�뿬湲곗꽌 �냼�뒪瑜� �닔�젙�븯硫� git�쓽 �썙�겕�듃由ъ뿉 �엳�뒗 �뙆�씪�씠 �닔�젙�릺�뒗 寃껋엫!!
		//�썙�겕�듃由�   ->   �씤�뜳�뒪   ->   濡쒖뺄���옣�냼   ->   �썝寃⑹��옣�냼
		//    "add index    "commit"         "put"  
		
		Student st = new Student("�븯�븯",40);
		System.out.println(st + "!!!!");
		System.out.println(st);
		
		Student st1 = new Student("�븯�븯�븯�븯",40);
		System.out.println(st1 + "!!!!");
		System.out.println(st1);
		
		System.out.println("안녕하세요");
	}
}
