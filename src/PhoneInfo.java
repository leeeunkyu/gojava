/*
 * 
 * 전화번호 관리 프로그램 구현 프로잭트
 * ver3.0
 */
import java.util.Scanner;

class Phoneinfo_delete			//사용자 데이터값을 삭제해주는 클래스
{
	public Phoneinfo_delete(String[][] search ,String name)
	{
		int i;
		int a;
		int go=0;
		outerLoop:					//java는 goto문이없으므로 이중 for문을 사용할때 라벨을 이용함 개중요@@@@@@@@@@@@@@@@@@@@@@@
		for(i=0;i<search.length;i++)
		{
			for(a=0;a<search[i].length;a++)
			{
				if(name.equals(search[i][a]))
				{
					System.out.println("i값은"+i);
					go=i;
					break outerLoop;
				}
				
			}
		}
		System.out.println("2222");
		System.out.println("i,go값확인"+i+go);
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
class Phoneinfo_search			//사용자 검색을 도와주는 클래스
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
					System.out.println("찾으려는값이 존재하지 않습니다.");
				}
		}
	}
}



class Phoneinfo_add{				//사용자 추가를 도와주는 클래스
	private String[][] info;
	static int i=0;			//static으로해야 함수가 호출될때마다 값이 초기화가 되지않네 개중요씹중요@@@@@@@@@@@@@@@@@@@@@@@@@
	public Phoneinfo_add(String[][] add)
	{
		
		info=add;
		this.ShowResult();
		
	}
	public void ShowResult()
	{
		System.out.println("데이터입력이 완료되었습니다..");
		System.out.println("데이터입력값을 확인하겠습니다..");
		System.out.println("name:  "+info[i][0]+"phone:  "+info[i][1]+"birth:  "+info[i][2]);
		i+=1;
	}
}
/*
 * 이름 전화번호 생년월일 정보들을 최대100명까지 저장할수있게 짜라
 * 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력해준다.
 * 이름을 기준으로 데이터를 찾아서 삭제를 하며 삭제시 빈메모리공간에 바로 뒤에있는 값들을 순차적으로 넣는다.
 */
public class PhoneInfo {
	public static void main(String[] args)
	{
		String choice;
		String search;		//검색용변수
		String delete;		//삭제용변수
		String[][] phoninfolist = new String[100][3];		//100명의데이터저장
		System.out.print("선택하시오...\n"+"1.데이터입력\n"+"2.데이터검색\n"+"3.데이터 삭제\n"+"4.프로그램종료\n");
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			choice=scan;
			if(choice==1)
			{
				System.out.printf("선택:"+choice+"\n");
				System.out.println("이름:");
				phoninfolist[i][0]=scan.next();
				System.out.println("전화번호:");
				phoninfolist[i][1]=scan.next();
				System.out.println("생일:");
				phoninfolist[i][2]=scan.next();
				Phoneinfo_add p_add=new Phoneinfo_add(phoninfolist);
				System.out.print("선택하시오...\n"+"1.데이터입력\n"+"2.데이터검색\n"+"3.데이터 삭제\n"+"4.프로그램종료\n");
			}
			else if(choice==2)
			{
				System.out.printf("선택:"+choice+"\n");
				System.out.println("데이터 검색을 시작합니다...");
				System.out.println("검색을 원하는 대상자 이름,번호,생일 셋중 원하시는 값하나만 입력하시오");
				search=scan.next();
				System.out.println("데이터 검색을 결과입니다...");
				Phoneinfo_search p_search=new Phoneinfo_search(phoninfolist,search);
				System.out.print("선택하시오...\n"+"1.데이터입력\n"+"2.데이터검색\n"+"3.데이터 삭제\n"+"4.프로그램종료\n");
				
			}
			else if(choice==3)
				
			{
				System.out.printf("선택:"+choice+"\n");
				System.out.println("데이터 삭제를 시작합니다...");
				System.out.println("삭제를 원하는 대상자 이름,번호,생일 셋중 원하시는 값하나만 입력하시오");
				delete=scan.next();
				Phoneinfo_delete p_delete=new Phoneinfo_delete(phoninfolist,delete);
				System.out.print("선택하시오...\n"+"1.데이터입력\n"+"2.데이터검색\n"+"3.데이터 삭제\n"+"4.프로그램종료\n");
			}
			else if(choice==4)
			{
				System.out.println("프로그램을 종료합니다."); 
				break;
			}
			else
			{
				System.out.println("잘못입력하셨습니다 값을 다시입력해주세요");	
				System.out.print("선택하시오...\n"+"1.데이터입력\n"+"2.데이터검색\n"+"3.데이터 삭제\n"+"4.프로그램종료\n");
			}
		}
	}
}
