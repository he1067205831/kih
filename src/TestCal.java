import java.util.*;
public class TestCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("������һ������");
		int  g=s.nextInt();
		while(true){	
			 
		System.out.println("������һ�����㷽ʽ��+,-,*,/");
		String l=s.next();
		System.out.println("������һ������");
		int  f=s.nextInt();	
		
		char ch=l.charAt(0);
		//����һ��Cal�Ķ���
		
		Cal cl = new Cal();
		
		//���ԣ���ֵ
		cl.a = g;
		cl.b = f;
		
		//��Ϊ������
		if(ch=='+'){
		int c=cl.jia();
		g=c;
		System.out.println("�����"+c);
		}else if(ch=='-'){
		//...
		 int c=cl.jian();
		 g=c;
		System.out.println("�����"+c);
		}else if(ch=='*'){
		int  c=cl.cheng();
		g=c;
		System.out.println("�����"+c);
		}else if(ch=='/'){
		int c=cl.chu();
		g=c;
		System.out.println("�����"+c);
		}else{
			System.out.println("��������");
		}
		
		}
		
	}

}
