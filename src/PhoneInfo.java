/*
 * 
 * ��ȭ��ȣ ���� ���α׷� ���� ������Ʈ
 * ver2.0
 */
import java.util.Scanner;
class Phone{
	private String info;
	public Phone(String infor)
	{
		this.info=infor;
		
	}
	public String ShowResult()
	{
		/*
		StringBuilder str=new StringBuilder();
		str.append(this.name).append(phonenumber).append(this.birthday).toString();
		*/
		return info;
	}
}
public class PhoneInfo {
	public static void main(String[] args)
	{
		int choice;
		String name;
		String phonenumber;
		String Birth;
		System.out.print("�����Ͻÿ�...\n"+"1.�������Է�"+"2.���α׷�����\n");
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			choice=scan.nextInt();
			if(choice==1)
			{
				System.out.printf("����:"+choice+"\n");
				System.out.println("�̸�:");
				name=scan.next();
				System.out.println("��ȭ��ȣ:");
				phonenumber=scan.next();
				System.out.println("����:");
				Birth=scan.next();
				Phone p=new Phone(name);
				Phone p2=new Phone(phonenumber);
				Phone p3=new Phone(Birth);
				System.out.println("�Էµ� ���� ���");
				System.out.println("name:\t"+p.ShowResult()+"\n"+"phone:\t"+p2.ShowResult()+"\n"+"birth:\t"+p3.ShowResult());
				System.out.print("�����Ͻÿ�...\n"+"1.�������Է�"+"2.���α׷�����");
			}
			else
			{
				System.out.println("���α׷��� �����մϴ�."); 
				break;
			}
		}
	}
}
