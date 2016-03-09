/*
 * 
 * 전화번호 관리 프로그램 구현 프로잭트
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
		System.out.print("선택하시오...\n"+"1.데이터입력"+"2.프로그램종료\n");
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			choice=scan.nextInt();
			if(choice==1)
			{
				System.out.printf("선택:"+choice+"\n");
				System.out.println("이름:");
				name=scan.next();
				System.out.println("전화번호:");
				phonenumber=scan.next();
				System.out.println("생일:");
				Birth=scan.next();
				Phone p=new Phone(name);
				Phone p2=new Phone(phonenumber);
				Phone p3=new Phone(Birth);
				System.out.println("입력된 정보 출력");
				System.out.println("name:\t"+p.ShowResult()+"\n"+"phone:\t"+p2.ShowResult()+"\n"+"birth:\t"+p3.ShowResult());
				System.out.print("선택하시오...\n"+"1.데이터입력"+"2.프로그램종료");
			}
			else
			{
				System.out.println("프로그램을 종료합니다."); 
				break;
			}
		}
	}
}
