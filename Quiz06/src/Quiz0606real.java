import java.util.Scanner;

public class Quiz0606real {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("입력받을 정수의 개수를 설정해주세요");
		int num = sc.nextInt();
	
		int sum =0;
		double avg;
		int s = new Integer(num);
		
		do{
			System.out.println("정수를 입력하세요");			
			int num1 = sc.nextInt();
			sum += num1;
			num--;
			if (num ==0) {
				break;
			}	
		}		
		while(num>0);
		avg = sum/s;

		System.out.println("결과의 합산 값은 : "+sum);
		System.out.println("결과의 평균 값은 : "+avg);

	}
}
