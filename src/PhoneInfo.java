/*
 * 
 * ��ȭ��ȣ ���� ���α׷� ���� ������Ʈ
 * ver3.0
 */
import java.util.Scanner;

class Phoneinfo_delete			//����� �����Ͱ��� �������ִ� Ŭ����
{
	public Phoneinfo_delete(String[][] search ,String name)
	{
		int i;
		int a;
		int go=0;
		outerLoop:					//java�� goto���̾����Ƿ� ���� for���� ����Ҷ� ���� �̿��� ���߿�@@@@@@@@@@@@@@@@@@@@@@@
		for(i=0;i<search.length;i++)
		{
			for(a=0;a<search[i].length;a++)
			{
				if(name.equals(search[i][a]))
				{
					System.out.println("i����"+i);
					go=i;
					break outerLoop;
				}
				
			}
		}
		System.out.println("2222");
		System.out.println("i,go��Ȯ��"+i+go);
		outerLoop:
		for(;go<=search.length;go++)
		{
			for(a=0;a<search[go].length;a++)
				if(go!=100)
				{
					search[go][a]=search[go+1][a];
					break outerLoop;
				}
		}
	}
}
class Phoneinfo_search			//����� �˻��� �����ִ� Ŭ����
{
	public Phoneinfo_search(String[][] search ,String name)
	{
		outerLoop:
		for(int i=0;i<=search.length;i++)
		{
			for(int a=0;a<search[i].length;a++)
				if(name.equals(search[i][a]))
				{
					System.out.println("name:  "+search[i][0]+"phone:  "+search[i][1]+"birth:  "+search[i][2]);
					break outerLoop;
				}
				else if(i==100 && a ==3)
				{
					System.out.println("ã�����°��� �������� �ʽ��ϴ�.");
				}
		}
	}
}



class Phoneinfo_add{				//����� �߰��� �����ִ� Ŭ����
	private String[][] info;
	static int i=0;			//static�����ؾ� �Լ��� ȣ��ɶ����� ���� �ʱ�ȭ�� �����ʳ� ���߿���߿�@@@@@@@@@@@@@@@@@@@@@@@@@
	public Phoneinfo_add(String[][] add)
	{
		
		info=add;
		this.ShowResult();
		
	}
	public void ShowResult()
	{
		System.out.println("�������Է��� �Ϸ�Ǿ����ϴ�..");
		System.out.println("�������Է°��� Ȯ���ϰڽ��ϴ�..");
		System.out.println("name:  "+info[i][0]+"phone:  "+info[i][1]+"birth:  "+info[i][2]);
		i+=1;
	}
}
/*
 * �̸� ��ȭ��ȣ ������� �������� �ִ�100����� �����Ҽ��ְ� ¥��
 * �̸��� �������� �����͸� ã�Ƽ� �ش� �������� ������ ������ش�.
 * �̸��� �������� �����͸� ã�Ƽ� ������ �ϸ� ������ ��޸𸮰����� �ٷ� �ڿ��ִ� ������ ���������� �ִ´�.
 */
public class PhoneInfo {
	public static void main(String[] args)
	{
		String choice;
		String search;		//�˻��뺯��
		String delete;		//�����뺯��
		String[][] phoninfolist = new String[100][3];		//100���ǵ���������
		System.out.print("�����Ͻÿ�...\n"+"1.�������Է�\n"+"2.�����Ͱ˻�\n"+"3.������ ����\n"+"4.���α׷�����\n");
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			choice=scan;
			if(choice==1)
			{
				System.out.printf("����:"+choice+"\n");
				System.out.println("�̸�:");
				phoninfolist[i][0]=scan.next();
				System.out.println("��ȭ��ȣ:");
				phoninfolist[i][1]=scan.next();
				System.out.println("����:");
				phoninfolist[i][2]=scan.next();
				Phoneinfo_add p_add=new Phoneinfo_add(phoninfolist);
				System.out.print("�����Ͻÿ�...\n"+"1.�������Է�\n"+"2.�����Ͱ˻�\n"+"3.������ ����\n"+"4.���α׷�����\n");
			}
			else if(choice==2)
			{
				System.out.printf("����:"+choice+"\n");
				System.out.println("������ �˻��� �����մϴ�...");
				System.out.println("�˻��� ���ϴ� ����� �̸�,��ȣ,���� ���� ���Ͻô� ���ϳ��� �Է��Ͻÿ�");
				search=scan.next();
				System.out.println("������ �˻��� ����Դϴ�...");
				Phoneinfo_search p_search=new Phoneinfo_search(phoninfolist,search);
				System.out.print("�����Ͻÿ�...\n"+"1.�������Է�\n"+"2.�����Ͱ˻�\n"+"3.������ ����\n"+"4.���α׷�����\n");
				
			}
			else if(choice==3)
				
			{
				System.out.printf("����:"+choice+"\n");
				System.out.println("������ ������ �����մϴ�...");
				System.out.println("������ ���ϴ� ����� �̸�,��ȣ,���� ���� ���Ͻô� ���ϳ��� �Է��Ͻÿ�");
				delete=scan.next();
				Phoneinfo_delete p_delete=new Phoneinfo_delete(phoninfolist,delete);
				System.out.print("�����Ͻÿ�...\n"+"1.�������Է�\n"+"2.�����Ͱ˻�\n"+"3.������ ����\n"+"4.���α׷�����\n");
			}
			else if(choice==4)
			{
				System.out.println("���α׷��� �����մϴ�."); 
				break;
			}
			else
			{
				System.out.println("�߸��Է��ϼ̽��ϴ� ���� �ٽ��Է����ּ���");	
				System.out.print("�����Ͻÿ�...\n"+"1.�������Է�\n"+"2.�����Ͱ˻�\n"+"3.������ ����\n"+"4.���α׷�����\n");
			}
		}
	}
}
