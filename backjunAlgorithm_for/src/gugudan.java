import java.util.Scanner;

public class gugudan {
//	N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
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
