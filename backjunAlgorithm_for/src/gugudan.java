import java.util.Scanner;

public class gugudan {
//	N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number>0 || number<10) {
			for(int i=1; i<10; i++) {
				int count = i*number;
				System.out.println(number +" * "+i+ " = " +count);
			}
		}else {
			
		}
		
	}

}
